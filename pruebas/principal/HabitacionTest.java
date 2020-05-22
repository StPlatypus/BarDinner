package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HabitacionTest {

	Banio banio;
	Cocina cocina;
	Salon salon;
	Cuarto cuarto;
	Jugador jugador;
	
	@Before
	public void setUp() throws Exception {
		
		banio = new Banio();
		cocina = new Cocina();
		salon = new Salon();
		cuarto = new Cuarto();
		jugador = Jugador.getJugador();
	}

	@After
	public void tearDown() throws Exception {
		
		banio = null;
		cocina = null;
		salon = null;
		cuarto = null;
		
	}

	@Test
	public void testHabitacion() {
		
		assertTrue(banio instanceof Banio);
		assertTrue(cocina instanceof Cocina);
		assertTrue(salon instanceof Salon);
		assertTrue(cuarto instanceof Cuarto);
		
		
	}

	@Test
	public void testAsignarBotinTotal() {
		
		assertTrue(banio.saquear()>=50 && banio.saquear()<=200);
		assertTrue(cocina.saquear()>=80 && cocina.saquear()<=700);
		assertTrue(salon.saquear()>=500 && salon.saquear()<=2200);
		assertTrue(cuarto.saquear()>=200 && cuarto.saquear()<=1500);
		
	}

	@Test
	public void testSaquear() {
		banio.saquear();
		assertSame(banio.saquear(), 0);
		cocina.saquear();
		assertSame(cocina.saquear(),0);
	}

}
