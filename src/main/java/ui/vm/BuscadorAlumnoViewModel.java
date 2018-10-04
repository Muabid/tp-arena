package ui.vm;

import org.uqbar.arena.windows.Dialog;
import org.uqbar.commons.utils.Observable;

import client.NotitasCliente;
import domain.Alumno;
import repos.RepoAlumnos;
import ui.windows.ErrorDeLoggeoWindow;
import exception.ExcepcionDeUsuario;

@Observable
public class BuscadorAlumnoViewModel {
	
	Alumno alumnoSeleccionado;
	String usuario;
	String password;
	
	
	
	public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}
	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String usuario) {
		this.password = usuario;
	}
	
	public void loggear() throws ExcepcionDeUsuario{
	/*	try {

	
			if (RepoAlumnos.obtenerContraseña(usuario).equals(password)) {
			//	alumnoSeleccionado = RepoAlumnos.buscar(usuario);
				
		}
		
		else {
			throw new ExcepcionDeUsuario("Contraseña incorrecta");
		}
		}
		
		catch(java.util.NoSuchElementException e) {
			throw new ExcepcionDeUsuario("Legajo inexistente");
		}
		*/
		alumnoSeleccionado = new NotitasCliente().getEstudiante("");
		
	}
	
}

