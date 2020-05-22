package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasaTest {
	
	ClaseCasaDePrueba casa;
	Habitacion habitacion;

	@Before
	public void setUp() throws Exception {
		
		casa = ClaseCasaDePrueba.getCasa();
		
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
		assertSame(casa.getNumHabitaciones(),5);
	}

	@Test
	public void testBuscarHabitacionPorID() {
		;
	}

	@Test
	public void testCrearCasa() {
		casa.crearCasa();
		System.out.println(casa.getNumHabitaciones());
		assertTrue(casa.getNumHabitaciones()>=5 && casa.getNumHabitaciones()<=10);
	}

	@Test
	public void testComprobarSiHaPerdido() {
		fail("Not yet implemented");
	}

}
