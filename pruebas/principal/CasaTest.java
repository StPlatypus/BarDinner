package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasaTest {
	
	ClaseCasaDePrueba casa;
	ListaResidentes listaResidentes;
	Jugador jugador;
	
	@Before
	public void setUp() throws Exception {
		
		casa = ClaseCasaDePrueba.getCasa();
		casa.crearCasa();
		listaResidentes = ListaResidentes.getListaResidentes();
		jugador = Jugador.getJugador();
	}

	@After
	public void tearDown() throws Exception {
		
		casa.resetear();
		listaResidentes.resetear();
		
	}

	@Test
	public void testGetCasa() {
		
		assertNotNull(casa);
		
	}

	@Test
	public void testGetNumHabitaciones() {

		assertSame(casa.getNumHabitaciones(),5);
	}

	@Test
	public void testBuscarHabitacionPorID() 
	{
		Habitacion habitacion;
		
		habitacion = casa.buscarHabitacionPorID(1);
		assertTrue(habitacion.getIDHabitacion() == 1);
		
		habitacion = casa.buscarHabitacionPorID(2);
		assertTrue(habitacion.getIDHabitacion() == 2);

		habitacion = casa.buscarHabitacionPorID(3);
		assertTrue(habitacion.getIDHabitacion() == 3);
		
		habitacion = casa.buscarHabitacionPorID(4);
		assertTrue(habitacion.getIDHabitacion() == 4);
		
		habitacion = casa.buscarHabitacionPorID(5);
		assertTrue(habitacion.getIDHabitacion() == 5);
	}

	@Test
	public void testCrearCasa() {
		assertSame(casa.getNumHabitaciones(),5);
		int numResidenteAProbar = 0;
		for (int i = 1; i <= 5; i++) 
		{
			numResidenteAProbar = numResidenteAProbar + listaResidentes.obtenerNumResidentes(i);
		}
		assertTrue(numResidenteAProbar>=2 && numResidenteAProbar<=4);
	}

	@Test
	public void testComprobarSiHaPerdido() {
		jugador.cambiarHabitacion(1);
		casa.comprobarSiHaPerdido();
		if (listaResidentes.obtenerNumResidentes(1) != 0)
		{
			assertTrue(jugador.haPerdido());
		}
		else
		{
			assertFalse(jugador.haPerdido());
		}
		if (!jugador.haPerdido())
		{
			jugador.cambiarHabitacion(2);
			casa.comprobarSiHaPerdido();
			if (listaResidentes.obtenerNumResidentes(2) != 0)
			{
				assertTrue(jugador.haPerdido());
			}
			else
			{
				assertFalse(jugador.haPerdido());
			}
		}
		if (!jugador.haPerdido())
		{
			jugador.cambiarHabitacion(3);
			casa.comprobarSiHaPerdido();
			if (listaResidentes.obtenerNumResidentes(3) != 0)
			{
				assertTrue(jugador.haPerdido());
			}
			else
			{
				assertFalse(jugador.haPerdido());
			}
		}
		if (!jugador.haPerdido())
		{
			jugador.cambiarHabitacion(4);
			casa.comprobarSiHaPerdido();
			if (listaResidentes.obtenerNumResidentes(4) != 0)
			{
				assertTrue(jugador.haPerdido());
			}
			else
			{
				assertFalse(jugador.haPerdido());
			}
		}
		if (!jugador.haPerdido())
		{
			jugador.cambiarHabitacion(5);
			casa.comprobarSiHaPerdido();
			if (listaResidentes.obtenerNumResidentes(5) != 0)
			{
				assertTrue(jugador.haPerdido());
			}
			else
			{
				assertFalse(jugador.haPerdido());
			}
		}
	}

}
