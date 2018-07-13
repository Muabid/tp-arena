package repos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Alumno;
import domain.Asignacion;
import domain.Conceptual;
import domain.Numerica;
import ui.vm.AlumnoViewModel;
import ui.windows.AlumnoWindow;

public class RepoAlumnos {
	static private List<Alumno> alumnos=new ArrayList<>();
	
	static public void add(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	static public List<Alumno> get(){
		return alumnos;
	}

	public static Alumno buscar(String legajo) {
		return alumnos.stream().filter(a->a.getLegajo().equals(legajo)).findFirst().get();
	}
	
	public static String obtenerContraseña(String legajo) {
		return buscar(legajo).getContraseña();
	}
	
	
	
	public static void start() {
		Asignacion asig = new Asignacion("TP Arena", Arrays.asList(new Numerica(10),new Numerica(5)));
		Asignacion asig2= new Asignacion("Parcial", Arrays.asList(new Conceptual("B+")));
		
		Alumno bruno= new Alumno("Bruno", "Cobos", "1223", "Muabid","holis",Arrays.asList(asig,asig2));
		Alumno karen= new Alumno("Karen","Lafuente","1314","Kalafuente","diosa",Arrays.asList(asig));
		alumnos.add(bruno);
		alumnos.add(karen);
				
	}
	
}
