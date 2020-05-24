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
		listaR.nuevoResidente(r1);
		
		
		j1=Jugador.getJugador();
		
	}

	@After
	public void tearDown() throws Exception {
		listaR.resetear();;
		casa=null;
		r1=null;
	}

	@Test
	public void testGetListaResidentes() {
		assertNotNull(listaR);
	}

	@Test
	public void testObtenerNumResidentes() {
		assertSame(1,listaR.obtenerNumResidentes(2));
		assertNotSame(1,listaR.obtenerNumResidentes(casa.getNumHabitaciones()));
	}

	@Test
	public void testHaPerdido() {
		assertFalse(j1.haPerdido());
		r1.moverse(2);	
		j1.cambiarHabitacion(2);
		listaR.haPerdido();
		assertTrue(j1.haPerdido());
	}

	@Test
	public void testCrearResidentes() {
		int a=0;
		listaR.crearResidentes();
		for(int i=1;i<=casa.getNumHabitaciones();i++) {
			a=a+listaR.obtenerNumResidentes(i);
		}
		System.out.println(a);
		assertTrue(a>=2 && a<=6);
	}

	@Test
	public void testMoverResidentes() {
		assertSame(1,listaR.obtenerNumResidentes(2));
		listaR.moverResidentes(casa.getNumHabitaciones());
		//50% chance de que se ejecute bien
		assertNotSame(1,listaR.obtenerNumResidentes(2));
	}

	@Test
	public void testResetear() {
		
		assertSame(1,listaR.obtenerNumResidentes(2));
		listaR.resetear();
		assertNotSame(1,listaR.obtenerNumResidentes(2));
	}

}
