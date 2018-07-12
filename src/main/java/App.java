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
			return new BuscarAlumnoWindow(this);
		}
	}
	

