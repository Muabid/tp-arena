package domain;

import java.util.Optional;

public class Conceptual implements Nota {

	private String nota;

	public Conceptual(String nota) {
		this.nota = nota;
		}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public boolean aprobada() {
		return !nota.equals("M");
	}

	@Override 
	public String toString() {
		return nota.toString() ;
	}
	
	
	
}
