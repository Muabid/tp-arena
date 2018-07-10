package domain;

import java.util.List;

import org.uqbar.commons.utils.Observable;


@Observable
public class Alumno {
	
	private String usuario;
	

	private String contraseña;
	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGitHub;
	private List<Asignacion> asignaciones;
	
	public Alumno(String nombre,String apellido, String legajo, String usuarioGitHub,
			List<Asignacion> asignacionesTarea) {
		
		this.nombre=nombre;
		this.legajo=legajo;
		this.usuarioGitHub=usuarioGitHub;
		this.asignaciones= asignacionesTarea;
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

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignacionesTarea) {
		this.asignaciones = asignacionesTarea;
	}

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
