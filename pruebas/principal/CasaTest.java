package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasaTest {
	
	ClaseCasaDePrueba casa;
	Habitacion habitacion;
	ListaResidentes listaResidentes;
	
	@Before
	public void setUp() throws Exception {
		
		casa = ClaseCasaDePrueba.getCasa();
		listaResidentes = ListaResidentes.getListaResidentes();
		
	}

	@After
	public void tearDown() throws Exception {
		
		casa.resetear();
		
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
	public void testBuscarHabitacionPorID() 
	{
		casa.crearCasa();
		assertTrue(casa.buscarHabitacionPorID(1).getIDHabitacion()==1);
		assertTrue(casa.buscarHabitacionPorID(2).getIDHabitacion()==2);
		assertTrue(casa.buscarHabitacionPorID(3).getIDHabitacion()==3);
		assertTrue(casa.buscarHabitacionPorID(4).getIDHabitacion()==4);
		assertTrue(casa.buscarHabitacionPorID(5).getIDHabitacion()==5);
		
	}

	@Test
	public void testCrearCasa() {
		casa.crearCasa();
		assertSame(casa.getNumHabitaciones(),5);
		int numResidenteAProbar = 0;
		for (int i = 1; i <= 5; i++) 
		{
			numResidenteAProbar = numResidenteAProbar + listaResidentes.obtenerNumResidentes(i);
		}
		assertTrue(numResidenteAProbar>=1 && numResidenteAProbar<=4);
	}

	@Test
	public void testComprobarSiHaPerdido() {
		fail("Not yet implemented");
	}

}
