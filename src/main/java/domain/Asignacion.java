package domain;

import java.util.List;

public class Asignacion {

	private Tarea tarea;
	List<Nota> notas;
	
	
	public Asignacion(Tarea tarea,List<Nota> notas) {
		this.notas=notas;
		this.tarea=tarea;
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
