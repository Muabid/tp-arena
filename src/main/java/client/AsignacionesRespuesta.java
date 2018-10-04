package client;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import domain.Asignacion;

public class AsignacionesRespuesta {

	@SerializedName("assignments")
	private List<Asignacion> asignaciones;
	
	public AsignacionesRespuesta(List<Asignacion> asignaciones) {
		this.asignaciones=asignaciones;
	}
	
	
	public List<Asignacion> asignaciones(){
		return asignaciones;
	}
	
	
}
