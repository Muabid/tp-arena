package domain;

public class Numerica implements Nota {

	Integer nota;
	
	public Numerica(Integer nota) {
		this.nota=nota;
	}
	
	
	@Override
	public boolean aprobada() {
		return nota>=6;
	}
	
	@Override
	public String toString() {
		return nota.toString();
	}
	
	

}
