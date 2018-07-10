package ui.windows;

import org.apache.commons.collections15.Transformer;
import org.uqbar.arena.bindings.DateTransformer;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Asignacion;
import domain.Nota;
import ui.vm.AlumnoViewModel;

public class AsignacionesWindow extends Dialog<AlumnoViewModel> {

	public AsignacionesWindow(WindowOwner owner, AlumnoViewModel model) {
		super(owner, model);
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones");

		Table<Asignacion> tableAsignaciones = new Table<>(formPanel, Asignacion.class);
		tableAsignaciones.bindItemsToProperty("alumnoSeleccionado.asignaciones");

		Column<Asignacion> columnaAsignacion = new Column<>(tableAsignaciones);
		columnaAsignacion.setTitle("Asignacion").bindContentsToProperty("descripcion");
		;

		Column<Asignacion> columnaNotaActual = new Column<>(tableAsignaciones);
		columnaNotaActual.setTitle("Nota actual").bindContentsToProperty("notaActual")
				.setTransformer(new NotaTransformer());
		;

		Column<Asignacion> columnaEstado = new Column<>(tableAsignaciones);
		columnaEstado.setTitle("Estado").bindContentsToProperty("aprobada").setTransformer(new EstadoTransformer());
		;

		tableAsignaciones.setHeight(300);
		tableAsignaciones.setWidth(600);
	}

	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Salir").onClick(this::cancel);
	}

	private final class NotaTransformer implements Transformer<Nota, String> {

		@Override
		public String transform(Nota nota) {

			return nota.toString();
		}

	}
	
	private final class EstadoTransformer implements Transformer<Boolean, String>{

		@Override
		public String transform(Boolean aprobado) {
			if(aprobado){
				return "Aprobada";
			}
			else {
				return "Desaprobada";
			}
		}
		
	}

}
