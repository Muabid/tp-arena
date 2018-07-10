package domain;

import java.util.Optional;

public class Conceptual implements Nota {

	private Character nota;
	private Optional<Character> modificador;

	public Conceptual(Character nota, Optional<Character> modificador) {
		this.nota = nota;
		this.modificador = modificador;
	}

	public Character getNota() {
		return nota;
	}

	public void setNota(Character nota) {
		this.nota = nota;
	}

	public Optional<Character> getModificador() {
		return modificador;
	}

	public void setModificador(Optional<Character> modificador) {
		this.modificador = modificador;
	}

	@Override
	public boolean aprobada() {
		return !nota.equals('M');
	}

	@Override 
	public String toString() {
		return nota.toString();
	}
}
