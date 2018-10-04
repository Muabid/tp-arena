package domain;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.uqbar.commons.utils.Observable;

import com.google.gson.annotations.SerializedName;


@Observable
public class Alumno {
	
	private String usuario;
	
	
	private String contraseña;
	@SerializedName("first_name")
	private String nombre;
	@SerializedName("last_name")
	private String apellido;
	
	private String legajo;
	@SerializedName("github_user")
	private String usuarioGitHub;
	private List<Asignacion> asignaciones;
	
	public Alumno(String nombre,String apellido, String legajo, String usuarioGitHub) {
		this.nombre=nombre;
		this.legajo=legajo;
		this.usuarioGitHub=usuarioGitHub;
		this.apellido=apellido;
	}
	
	public Alumno(String nombre,String apellido, String legajo, String usuarioGitHub, String password,
			List<Asignacion> asignacionesTarea) {
		
		this.nombre=nombre;
		this.legajo=legajo;
		this.usuarioGitHub=usuarioGitHub;
		this.apellido=apellido;
		this.asignaciones= asignacionesTarea;
		this.contraseña=password;
		
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
