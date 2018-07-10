package domain;

import java.util.List;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

@Observable
public class Asignacion <TipoNota extends Nota> {

	private String descripcion;
	
	
	
	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private Tarea tarea;
	private List<TipoNota> notas;
	
	
	public Asignacion(String descripcion,Tarea tarea,List<TipoNota> notas) {
		this.notas=notas;
		this.tarea=tarea;
		this.descripcion=descripcion;
	}
	
	
	public boolean aprobada() {
		return notaActual().aprobada();
	}
		
	public List<TipoNota> getNotas(){
		return notas;
	}
	
	public Nota notaActual() {
		return notas.get(notas.size()-1);
	}
	public void ponerNota(TipoNota nota) {
		notas.add(nota);
	}
	
	
}
