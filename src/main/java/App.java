import java.util.Arrays;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import domain.Alumno;
import domain.Asignacion;
import domain.Conceptual;
import domain.Numerica;
import repos.RepoAlumnos;
import ui.vm.AlumnoViewModel;
import ui.windows.AlumnoWindow;
import ui.windows.BuscarAlumnoWindow;

public class App extends Application {

		public static void main(String[] arg) {
			RepoAlumnos.start();
			new App().start();
		}
		@Override
		protected Window<?> createMainWindow() {
			Asignacion<Numerica> asig = new Asignacion<>("TP Arena",null, Arrays.asList(new Numerica(10),new Numerica(5)));
			Asignacion<Conceptual> asig2= new Asignacion<>("Parcial",null,Arrays.asList(new Conceptual('M',null)));
			Alumno a= new Alumno("Bruno", "Cobos", "1223", "Muabid",Arrays.asList(asig,asig2));
			AlumnoViewModel al = new AlumnoViewModel(a);
			
			return new BuscarAlumnoWindow(this);
		}
	}
	

