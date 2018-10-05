import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;

import client.NotitasCliente;
import domain.Alumno;
import domain.Asignacion;
import junit.framework.Assert;

public class RequestServiceTest {
	 NotitasCliente requester;
	 private static final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFI"
				+ "wN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";

	  @Before
	  public void setUp() throws Exception {
	      
		  this.requester = new NotitasCliente();
	   
	  }
	  
	  @Test
	  public void obtenerAlumno() throws Exception {
	  
		  Alumno alumnoObtenido = this.requester.getEstudiante(TOKEN);
		  Assert.assertEquals("Fa", alumnoObtenido.getNombre());
	        
	  }
	  
	  @Test
	  public void obtenerAsignacionesAlumno() throws Exception {
	    
		  List<Asignacion> notitas = this.requester.getAsignaciones(TOKEN);
		  Assert.assertEquals("Entrega 1 del TP Anual", notitas.get(0).getDescripcion());
	        
	  } 
	  
	  @Test
	  public void actualizarDatosEstudiante()  throws Exception {
		  
		  this.requester.actualizarDatosEstudiante(TOKEN , new Alumno("Fa", "Raona", "1594521", "dino"));
		  Alumno alumnoObtenido = this.requester.getEstudiante(TOKEN);
		  Assert.assertEquals("Fa", alumnoObtenido.getNombre());
		  
	  }
}
