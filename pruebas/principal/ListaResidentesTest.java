package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaResidentesTest {
	
	ListaResidentes listaR;
	Casa casa;
	Residente r1;
	Jugador j1;
	
	@Before
	public void setUp() throws Exception {
		
		listaR=ListaResidentes.getListaResidentes();
		
		casa = Casa.getCasa();
		casa.crearCasa();
		
		r1= new Residente(2);
		
		
		j1=Jugador.getJugador();
		
	}

	@After
	public void tearDown() throws Exception {
		listaR.resetear();;
		casa.resetear();;
		r1=null;
	}

	@Test
	public void testGetListaResidentes() {
		assertNotNull(listaR);
	}

	@Test
	public void testObtenerNumResidentes() {
		int numResidentesTotales = 0;
		for (int i = 1; i <= casa.getNumHabitaciones(); i++)
		{
			numResidentesTotales = numResidentesTotales + listaR.obtenerNumResidentes(i);
		}
		assertTrue(numResidentesTotales >= 2 && numResidentesTotales <= 4);
	}

	@Test
	public void testHaPerdido() {
		j1.cambiarHabitacion(1);
		listaR.haPerdido();
		if (listaR.obtenerNumResidentes(1) != 0)
		{
			assertTrue(j1.haPerdido());
		}
		else
		{
			assertFalse(j1.haPerdido());
		}
		if (!j1.haPerdido())
		{
			j1.cambiarHabitacion(2);
			listaR.haPerdido();
			if (listaR.obtenerNumResidentes(2) != 0)
			{
				assertTrue(j1.haPerdido());
			}
			else
			{
				assertFalse(j1.haPerdido());
			}
		}
		if (!j1.haPerdido())
		{
			j1.cambiarHabitacion(3);
			listaR.haPerdido();
			if (listaR.obtenerNumResidentes(3) != 0)
			{
				assertTrue(j1.haPerdido());
			}
			else
			{
				assertFalse(j1.haPerdido());
			}
		}
		if (!j1.haPerdido())
		{
			j1.cambiarHabitacion(4);
			listaR.haPerdido();
			if (listaR.obtenerNumResidentes(4) != 0)
			{
				assertTrue(j1.haPerdido());
			}
			else
			{
				assertFalse(j1.haPerdido());
			}
		}
		if (!j1.haPerdido())
		{
			j1.cambiarHabitacion(5);
			listaR.haPerdido();
			if (listaR.obtenerNumResidentes(5) != 0)
			{
				assertTrue(j1.haPerdido());
			}
			else
			{
				assertFalse(j1.haPerdido());
			}
		}
	}

	@Test
	public void testCrearResidentes() {
		int numResidentesPrueba = 0;
		System.out.println("Prueba crearResidentes");
		for (int i = 1; i <= casa.getNumHabitaciones(); i++)
		{
			System.out.println("El numero de Residentes en la habitacion " + i +" es " + listaR.obtenerNumResidentes(i));
			numResidentesPrueba = numResidentesPrueba + listaR.obtenerNumResidentes(i);
		}
		assertTrue(numResidentesPrueba >= 2 && numResidentesPrueba <= 4);
		System.out.println();
	}

	@Test
	public void testMoverResidentes() {
		//Se va a ejecutar 10 el mover residentes y se va a imprimir po pantalla el numero de residentes en cada habitacion.
		//Al menos en alguna de las ejecuciones se debe de ver movimiento.
		System.out.println("Prueba moverResidentes");
		for (int j = 1; j <= 10; j++)
		{
			System.out.println("Prueba numero "+ j);
			listaR.moverResidentes(casa.getNumHabitaciones());
			for (int i = 1; i <= casa.getNumHabitaciones(); i++)
			{
				System.out.println("El numero de Residentes en la habitacion " + i +" es " + listaR.obtenerNumResidentes(i));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	}



