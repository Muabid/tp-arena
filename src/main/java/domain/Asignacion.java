package domain;

import java.util.List;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

@Observable
public class Asignacion {

	private String descripcion;
	
	
	
	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	private List<Nota> notas;
	
	
	public Asignacion(String descripcion,List<Nota> notas) {
		this.notas=notas;
		this.descripcion=descripcion;
	}
	
	
	public boolean aprobada() {
		return notaActual().aprobada();
	}
		
	public List<Nota> getNotas(){
		return notas;
	}
	
	public Nota notaActual() {
		return notas.get(notas.size()-1);
	}
	public void ponerNota(Nota nota) {
		notas.add(nota);
	}
	
	
}
