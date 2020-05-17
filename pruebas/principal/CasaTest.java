package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasaTest {
	
	Casa casa;

	@Before
	public void setUp() throws Exception {
		
		casa = Casa.getCasa();
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		casa = null;
		
	}

	@Test
	public void testGetCasa() {
		
		assertNotNull(casa);
		
	}

	@Test
	public void testGetNumHabitaciones() {
		casa.crearCasa();
		System.out.println(casa.getNumHabitaciones());
		assertTrue(casa.getNumHabitaciones()>=5 && casa.getNumHabitaciones()<=10);
	}

	@Test
	public void testBuscarHabitacionPorID() {
		fail("Not yet implemented");
	}

	@Test
	public void testCrearCasa() {
		fail("Not yet implemented");
	}

	@Test
	public void testComprobarSiHaPerdido() {
		fail("Not yet implemented");
	}

}
