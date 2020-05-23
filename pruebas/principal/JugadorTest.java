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
		jugador.resetear();
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
		jugador.cambiarHabitacion(1);
		assertSame(jugador.getIDHabitacion(),1);
		jugador.cambiarHabitacion(2);
		assertSame(jugador.getIDHabitacion(),2);
		jugador.cambiarHabitacion(3);
		assertSame(jugador.getIDHabitacion(),3);
		jugador.cambiarHabitacion(4);
		assertSame(jugador.getIDHabitacion(),4);
		jugador.cambiarHabitacion(5);
		assertSame(jugador.getIDHabitacion(),5);
	}

	@Test
	public void testSalirDeCasa() {
		jugador.salirDeCasa();
		assertSame(jugador.getIDHabitacion(),0);
	}

	@Test
	public void testGetIDHabitacion() {
		assertSame(jugador.getIDHabitacion(),1);
		jugador.cambiarHabitacion(2);
		assertSame(jugador.getIDHabitacion(),2);
		jugador.cambiarHabitacion(3);
		assertSame(jugador.getIDHabitacion(),3);
		jugador.cambiarHabitacion(4);
		assertSame(jugador.getIDHabitacion(),4);
		jugador.cambiarHabitacion(5);
		assertSame(jugador.getIDHabitacion(),5);
	}

	@Test
	public void testPerderPartida() {
		assertFalse(jugador.haPerdido());
		jugador.perderPartida();
		assertTrue(jugador.haPerdido());
	}

	@Test
	public void testHaPerdido() {
		assertFalse(jugador.haPerdido());
		jugador.perderPartida();
		assertTrue(jugador.haPerdido());
	}

}
