package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Asignacion;
import ui.vm.AlumnoViewModel;

public class EditarDatosWindow extends Dialog<AlumnoViewModel> {

	public EditarDatosWindow(WindowOwner owner, AlumnoViewModel model) {
		super(owner, model);

	}

	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Actualizar").onClick(() -> this.getModelObject().actualizar());
		new Button(actions).setCaption("Cancelar").onClick(this::cancel);
	}

	@Override
	protected void createFormPanel(Panel form) {

		this.setTitle("ALGUN TITULO");
		Panel edit = new Panel(form);
		edit.setLayout(new ColumnLayout(2));

		new Label(form).setText("Nombre");
		new TextBox(form).bindValueToProperty("nombre");

		new Label(form).setText("Apellido");
		new TextBox(form).bindValueToProperty("apellido");

		new Label(form).setText("Github");
		new TextBox(form).bindValueToProperty("usuarioGitHub");

	}

}
