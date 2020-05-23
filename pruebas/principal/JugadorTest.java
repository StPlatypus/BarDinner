package principal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
	Casa casa;
	Jugador jugador;
	ListaResidentes listaResidentes;
	@Before
	public void setUp() throws Exception {
		jugador = Jugador.getJugador();
		casa = Casa.getCasa();
		listaResidentes = ListaResidentes.getListaResidentes();
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
		int botinAcumulado = 0;
		casa.crearCasa();
		ListaResidentes.getListaResidentes().resetear();
		for (int i = 1; i<=casa.getNumHabitaciones(); i++)
		{
			jugador.cambiarHabitacion(i);
			jugador.saquearHabtiacion();
			System.out.println(jugador.getBotin() + ">" + botinAcumulado);
			assertTrue(jugador.getBotin() > botinAcumulado);
			botinAcumulado = jugador.getBotin();
		}
	}

	@Test
	public void testRuidoEnHabitacion() {
		casa.crearCasa();
		for (int i = 1; i<=casa.getNumHabitaciones(); i++)
		{
			if (listaResidentes.obtenerNumResidentes(i)!=0)
			{
				System.out.println("Se ha detectado que hay alguien en la habitacion. Asi que se va a imprimir 10 veces la respuesta de si hay residentes o no.");
				System.out.println("Mas o menos, 8 de las 10 veces debe decir que ha oido a alguien y dos que no.");
				for (int j = 1; j<=10;j++)
				{
					jugador.ruidoEnHabitacion(i);
				}
			}
			else 
			{
				System.out.println("No hay nadie en la habitacion, de forma que no se debe de imprimir ni una vez que hay alguien.");
				for (int j = 1; j<=4;j++)
				{
					jugador.ruidoEnHabitacion(i);
				}
			}
		}
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
