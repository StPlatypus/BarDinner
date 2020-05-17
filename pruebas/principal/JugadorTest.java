package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
	Casa casa;
	Jugador jugador;
	@Before
	public void setUp() throws Exception {
		jugador = Jugador.getJugador();
		casa = Casa.getCasa();
	}

	@After
	public void tearDown() throws Exception {
		jugador = null;
	}

	@Test
	public void testGetJugador() {
		assertNotNull(jugador);
	}

	@Test
	public void testSaquearHabtiacion() {
		System.out.println(jugador.getBotin());
		jugador.cambiarHabitacion(2);
		jugador.saquearHabtiacion();
		System.out.println(jugador.getBotin());
		assertNotSame(jugador.getBotin(),0);
	}

	@Test
	public void testRuidoEnHabitacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testCambiarHabitacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSalirDeCasa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIDHabitacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testPerderPartida() {
		fail("Not yet implemented");
	}

	@Test
	public void testHaPerdido() {
		fail("Not yet implemented");
	}

}
