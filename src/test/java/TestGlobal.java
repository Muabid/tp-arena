import org.junit.Before;
import org.junit.Test;
import domain.Alumno;
import junit.framework.Assert;
import repos.RepoAlumnos;


public class TestGlobal {
	Alumno bruno;
	Alumno karen;
	
	@Before
	public void init() {
		
		RepoAlumnos.start();
		bruno=RepoAlumnos.buscar("1223");
		karen=RepoAlumnos.buscar("1314");
		new App().start();	
	}
	
	@Test
	
	public void testBruno() {
	Assert.assertEquals("BrunoC", bruno.getNombre());	
	Assert.assertEquals("BrunoC", bruno.getApellido());
	Assert.assertEquals("BrunoC", bruno.getUsuarioGitHub());
	}
	
	
	
}
