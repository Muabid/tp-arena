package client;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import domain.Alumno;
import domain.Asignacion;

public class NotitasCliente {
	private Client client;
    private static final String API = "http://notitas.herokuapp.com";
    private static final String STUDENT = "student";
    private static final String ASSIGNMENTS = "student/assignments";
    
    
    public NotitasCliente(){
    	this.client=Client.create();
    }
    
    
    public Alumno getEstudiante(String TOKEN) {	    	
    	ClientResponse response = this.client.resource(API).path(STUDENT)
    			.header(HttpHeaders.AUTHORIZATION, TOKEN)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
    	
    	if (response.getStatus() != 200) {
    		throw new RuntimeException("Failed : HTTP error code : "
    		+ response.getStatus());
    	}

    	String output = response.getEntity(String.class);
    	//System.out.println(output);
    	return new Gson().fromJson(output, Alumno.class);
    	
    }
        
    public void actualizarDatosEstudiante(String TOKEN, Alumno alumnoActualizado) {
    	
    	String input = new Gson().toJson(alumnoActualizado);
    		
    	ClientResponse response = this.client.resource(API).path(STUDENT)
    		.header(HttpHeaders.AUTHORIZATION, TOKEN)
    		.accept(MediaType.APPLICATION_JSON)
    		.put(ClientResponse.class, input);
    		
    	if (response.getStatus() != 201) {
    		throw new RuntimeException("Failed : HTTP error code : "
    			+ response.getStatus());
    		}
    		
    }

    public List<Asignacion> getAsignaciones(String TOKEN) {
    	
    	ClientResponse response = this.client.resource(API).path(ASSIGNMENTS)
    		.header(HttpHeaders.AUTHORIZATION, TOKEN)
            .accept(MediaType.APPLICATION_JSON)
            .get(ClientResponse.class);
    	
    	if (response.getStatus() != 200) {
    		throw new RuntimeException("Failed : HTTP error code : "
    		+ response.getStatus());
    	}

    	String output = response.getEntity(String.class);
    	System.out.println(output);
    	return new Gson().fromJson(output, AsignacionesRespuesta.class).asignaciones();
    }
    
  
    public static void main(String[] arg) {
    List<Asignacion> asig=	new NotitasCliente().getAsignaciones("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFI"
				+ "wN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
    System.out.print(asig);
    }
    
    
}