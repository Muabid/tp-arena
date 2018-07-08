package domain;

import java.util.List;

public class Alumno {
	
	
	String nombre;
	String apellido;
	String legajo;
	String usuarioGitHub;
	List<Asignacion> asignacionesTarea;
		
	public Alumno(String nombre,String apellido, String legajo, String usuarioGitHub,List<Asignacion> asignacionesTarea) {
		this.nombre=nombre;
		this.legajo=legajo;
		this.usuarioGitHub=usuarioGitHub;
		this.asignacionesTarea= asignacionesTarea;
		this.apellido=apellido;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getUsuarioGitHub() {
		return usuarioGitHub;
	}

	public void setUsuarioGitHub(String usuarioGitHub) {
		this.usuarioGitHub = usuarioGitHub;
	}

	public List<Asignacion> getAsignacionesTarea() {
		return asignacionesTarea;
	}

	public void setAsignacionesTarea(List<Asignacion> asignacionesTarea) {
		this.asignacionesTarea = asignacionesTarea;
	}

	
	
}
