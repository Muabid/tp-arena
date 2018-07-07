package domain;

import java.util.List;

public class Alumno {
	
	String nombre;
	String legajo;
	String usuarioGitHub;
	List<Asignacion> asignacionesTarea;
		
	public Alumno(String nombre, String legajo, String usuarioGitHub,List<Asignacion> asignacionesTarea) {
		this.nombre=nombre;
		this.legajo=legajo;
		this.usuarioGitHub=usuarioGitHub;
		this.asignacionesTarea= asignacionesTarea;
	}
	
}
