package exception;
import org.omg.CORBA.UserException;
	public class ExcepcionDeUsuario extends UserException {

	    public ExcepcionDeUsuario() {
	        super();
	    }
	
	    public ExcepcionDeUsuario(String message) {
	        super(message);
	    }

	}

