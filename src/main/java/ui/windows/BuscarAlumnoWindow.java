package ui.windows;


import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Alumno;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;

import ui.vm.BuscadorAlumnoViewModel;

public class BuscarAlumnoWindow extends SimpleWindow<BuscadorAlumnoViewModel>{

	
	public BuscarAlumnoWindow(WindowOwner parent) {
		super(parent, new BuscadorAlumnoViewModel());
	}

	
	@Override
	protected void addActions(Panel panel) {
		new Button(panel).setCaption("Buscar")
		.onClick(this::buscar);
	
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Menu Alumno");

		new Label(mainPanel)
				.setText("Ingrese su Legajo");
		new NumericField(mainPanel).bindValueToProperty("legajo");
		mainPanel.setWidth(200);

	}
	
	public void buscar() {
		getModelObject().buscar();
		Dialog<?> window = new AlumnoWindow(this,getModelObject().getAlumnoSeleccionado());
		window.open();
			
	}
	

}
