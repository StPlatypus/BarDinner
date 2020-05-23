package principal;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaResidentesTest {
	
	ListaResidentes listaR;
	Casa casa;
	Residente r1,r2,r3;
	Jugador j1;
	@Before
	public void setUp() throws Exception {
		
		listaR=ListaResidentes.getListaResidentes();
		
		casa = Casa.getCasa();
		
		r1=new Residente(2);
		
		j1=Jugador.getJugador();
	
		listaR.nuevoResidente(r1);
	}

	@After
	public void tearDown() throws Exception {
		listaR=null;
		casa =null;
		r1=null;
		r2=null;
		r3=null;
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
	public void testNuevoResidente() {
		
	}

	@Test
	public void testHaPerdido() {
		listaR.haPerdido();
		j1.cambiarHabitacion(2);
		
	}

	@Test
	public void testCrearResidentes() {
		
	}

	@Test
	public void testMoverResidentes() {
		assertSame(1,listaR.obtenerNumResidentes(2));
		listaR.moverResidentes(casa.getNumHabitaciones());
		assertNotSame(1,listaR.obtenerNumResidentes(2));
	}

	@Test
	public void testResetear() {
		assertSame(1,listaR.obtenerNumResidentes(2));
		listaR.resetear();
		assertNotSame(1,listaR.obtenerNumResidentes(2));
	}

}
