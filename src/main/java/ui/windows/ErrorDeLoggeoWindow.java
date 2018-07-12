package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import ui.vm.ErrorDeLoggeoViewModel;


public class ErrorDeLoggeoWindow extends Dialog<ErrorDeLoggeoViewModel> {
	
	public ErrorDeLoggeoWindow(WindowOwner parent, String error) {
		super(parent, new ErrorDeLoggeoViewModel(error));
	}
	
	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Error en el loggeo");
		Panel form = new Panel(formPanel);
		new Label(form).setText(getModelObject().getError());
		
	}
	
	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Volver").onClick(this::cancel);
	}
}
