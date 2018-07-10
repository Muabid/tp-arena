package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import domain.Alumno;
import repos.RepoAlumnos;

@Observable
public class AlumnoViewModel {
	private Alumno alumnoSeleccionado;

	public AlumnoViewModel(Alumno alumno) {
		this.alumnoSeleccionado = alumno;
	}

	public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}

	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
	}

}
