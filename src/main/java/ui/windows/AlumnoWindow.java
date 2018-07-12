package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Alumno;
import ui.vm.AlumnoViewModel;

public class AlumnoWindow extends Dialog<AlumnoViewModel> {

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
		this.setTitle("Campus virtual");
		Panel form = new Panel(formPanel);
		form.setLayout(new ColumnLayout(2));

		new Label(form).setText("Nombre");
		new Label(form).bindValueToProperty("alumnoSeleccionado.nombre");

		new Label(form).setText("Apellido");
		new Label(form).bindValueToProperty("alumnoSeleccionado.apellido");

		new Label(form).setText("Github");
		new Label(form).bindValueToProperty("alumnoSeleccionado.usuarioGitHub");
	
		new Label(form).setText("Legajo");
		new Label(form).bindValueToProperty("alumnoSeleccionado.legajo");
		
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
