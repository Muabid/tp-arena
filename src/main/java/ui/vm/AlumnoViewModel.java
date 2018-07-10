package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import domain.Alumno;
import repos.RepoAlumnos;

@Observable
public class AlumnoViewModel {
	private Alumno alumnoSeleccionado;
	private List<Alumno> listadoAlumnos;

	public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}

	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
	}

	public List<Alumno> getListadoAlumnos() {
		return listadoAlumnos;
	}

	public void setListadoAlumnos(List<Alumno> listadoAlumnos) {
		this.listadoAlumnos = listadoAlumnos;
	}

	public AlumnoViewModel(Alumno alumno) {
		this.alumnoSeleccionado = alumno;
		this.listadoAlumnos = RepoAlumnos.get();
	}

}
