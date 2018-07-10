package repos;

import java.util.ArrayList;
import java.util.List;

import domain.Alumno;

public class RepoAlumnos {
	static private List<Alumno> alumnos=new ArrayList<>();
	
	static public void add(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	static public List<Alumno> get(){
		return alumnos;
	}
	
	
}
