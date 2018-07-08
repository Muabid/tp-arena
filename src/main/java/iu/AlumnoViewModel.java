package iu;

import javax.xml.ws.BindingType;

import domain.*;

public class AlumnoViewModel {
	Alumno alumno;
	Asignacion asignacionSeleccionada;
	
	public AlumnoViewModel(Alumno alumno) {
		this.alumno=alumno;
		this.asignacionSeleccionada=alumno.getAsignacionesTarea().get(0);
	}
	
	public Alumno getAlumno() {
		return alumno;
	}
    
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignacion getAsignacionSeleccionada() {
		return asignacionSeleccionada;
	}

	public void setAsignacionSeleccionada(Asignacion asignacionSeleccionada) {
		this.asignacionSeleccionada = asignacionSeleccionada;
	}

	
	
}
