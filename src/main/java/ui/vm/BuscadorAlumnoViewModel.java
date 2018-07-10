package ui.vm;

import domain.Alumno;
import repos.RepoAlumnos;

public class BuscadorAlumnoViewModel {
	
	Alumno alumnoSeleccionado;
	String legajo;
	
	
	
	public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}
	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	public void buscar() {
		alumnoSeleccionado = RepoAlumnos.buscar(legajo);
	}
	
	
	
}
