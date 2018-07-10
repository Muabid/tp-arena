package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Alumno;
import ui.vm.AlumnoViewModel;

public class AlumnoWindow extends SimpleWindow<AlumnoViewModel> {

	public AlumnoWindow(WindowOwner parent, Alumno alumno) {
		super(parent, new AlumnoViewModel(alumno));
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions).setCaption("Ver asignaciones").onClick(this::verAsignaciones);

		new Button(panelActions).setCaption("Editar datos").onClick(this::editarDatos);
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("HOLA");

	}

	public void verAsignaciones() {
		Dialog<?> dialog = new AsignacionesWindow(this, this.getModelObject());
		dialog.open();

	}

	public void editarDatos() {
		Dialog<?> dialog = new EditarDatosWindow(this, this.getModelObject());
		dialog.open();

	}
}
