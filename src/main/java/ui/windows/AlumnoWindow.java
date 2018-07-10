package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.AlumnoViewModel;

public class AlumnoWindow extends SimpleWindow<AlumnoViewModel> {

	public AlumnoWindow(WindowOwner parent,AlumnoViewModel model) {
		super(parent, model);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Ver asignaciones")
		.onClick(this::registrarVenta);
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("HOLA");
		
	}

	public void registrarVenta() {
		Dialog<?> dialog = new AsignacionesWindow(this,this.getModelObject());
		dialog.open();
		dialog.onAccept(() -> {});
		
	}


}
