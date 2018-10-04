package domain;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Asignacion {

	private int id;
	private String title;
	private String description;
	private List<Nota> notas;
	
	public String getDescripcion() {
		return description;
	}


	public void setDescripcion(String descripcion) {
		this.description = descripcion;
	}
		
	public Asignacion(int id, String title, String descripcion,List<Nota> notas) {
		this.id = id;
		this.title = title;
		this.notas=notas;
		this.description=descripcion;
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
