package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResidenteTest {

	Residente r1,r2,r3;
	Jugador j1;
	Casa casa;
	@Before
	public void setUp() throws Exception {
		casa = Casa.getCasa();
		
		r1= new Residente((int)(Math.random()*casa.getNumHabitaciones()-1)+2); //numero aleatorio
		r2= new Residente(10);
		r3= new Residente(2);
		
		j1= Jugador.getJugador();
		
	
			
	}

	@After
	public void tearDown() throws Exception {
		r1=null;
		r2=null;
		r3=null;
		
	}

	@Test
	public void testResidente() { // El residente esta en la habiatcion 
		assertNotNull(r1);
		assertNotNull(r2);
		assertNotNull(r1);
		assertNotNull(r1);
		
	}

	@Test
	public void testDelatarAJugador() {
		assertFalse(j1.haPerdido());
		j1.cambiarHabitacion(2);
		r2.moverse(2);
		r2.delatarAJugador();
		assertTrue(j1.haPerdido());
	}

	@Test
	public void testMoverse() {
		assertEquals(10,r2.getIDHabitacion());
		r2.moverse(2);
		assertEquals(2,r2.getIDHabitacion());
	}

	@Test
	public void testGetIDHabitacion() {
		assertEquals(10,r2.getIDHabitacion());
		assertNotEquals(2,r2.getIDHabitacion());
		
		assertNotEquals(2,r2.getIDHabitacion());
	}

}
