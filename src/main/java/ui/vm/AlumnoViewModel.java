package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;
import org.uqbar.lacar.ui.model.Action;

import client.NotitasCliente;
import domain.Alumno;
import repos.RepoAlumnos;


@Observable
public class AlumnoViewModel {
	
	private Alumno alumnoSeleccionado;
	private String nombre;
	private String apellido;
	private String usuarioGitHub;
	private String legajo;

	public AlumnoViewModel(Alumno alumno) {
		this.alumnoSeleccionado = alumno;
		this.asignar(alumno);
	}
	
	/*
	 * Se puede delegar un metodo actualizar(nombre,apellido,usuarioGithub) en alumno, pero no sé
	 */
	public void actualizar() {	
		alumnoSeleccionado.setApellido(apellido);
		alumnoSeleccionado.setNombre(nombre);
		alumnoSeleccionado.setUsuarioGitHub(usuarioGitHub);
		alumnoSeleccionado.setLegajo(legajo);
		
		new NotitasCliente().actualizarDatosEstudiante(alumnoSeleccionado);
	}
	
	public void asignar(Alumno alumno) {
		this.nombre=alumno.getNombre();
		this.apellido=alumno.getApellido();
		this.usuarioGitHub=alumno.getUsuarioGitHub();
		this.legajo=alumno.getLegajo();
	}

	public void cancelar() {
		asignar(this.alumnoSeleccionado);
	}
	
	
	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}

	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
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

	public String getUsuarioGitHub() {
		return usuarioGitHub;
	}

	public void setUsuarioGitHub(String usuarioGitHub) {
		this.usuarioGitHub = usuarioGitHub;
	}
}
