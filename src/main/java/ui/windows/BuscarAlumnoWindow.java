package ui.windows;


import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import exception.ExcepcionDeUsuario;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import ui.vm.BuscadorAlumnoViewModel;


public class BuscarAlumnoWindow extends SimpleWindow<BuscadorAlumnoViewModel>{
	
	
	public BuscarAlumnoWindow(WindowOwner parent) {
		super(parent, new BuscadorAlumnoViewModel());
	}

	
	@Override
	protected void addActions(Panel panel) {
		Button boton = new Button(panel).setCaption("Buscar").setAsDefault();
		boton.onClick(this::loggear);
		boton.disableOnError();
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Campus virtual");

		new Label(mainPanel)
				.setText("Ingrese legajo").setWidth(300);
		new NumericField(mainPanel).bindValueToProperty("usuario");
		
		new Label(mainPanel)
		.setText("Ingrese su contraseña").setWidth(300);
		new PasswordField(mainPanel).bindValueToProperty("password");

	}
	
	public void loggear() {
		try {
		getModelObject().loggear();
		Dialog<?> window = new AlumnoWindow(this,getModelObject().getAlumnoSeleccionado());
		window.open();
		} 
		
		catch (ExcepcionDeUsuario e) {
			Dialog<?> window = new ErrorDeLoggeoWindow(this, e.getMessage());
			window.open();
		} 							
	}
	

}
