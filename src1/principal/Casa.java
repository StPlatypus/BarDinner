package principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Casa {
	private ArrayList<Habitacion> lista;
	private static Casa miCasa;
	
	private Casa() {
		this.lista=new ArrayList<Habitacion>();
	}
	
	public static Casa getCasa() {
		if(Casa.miCasa==null) {
			Casa.miCasa= new Casa();
		}
		return Casa.miCasa;
	}
	private Iterator<Habitacion> getIterator(){
		return this.lista.iterator();
	}
	public int getNumHabitaciones() {
		return this.lista.size();
	}
	public Habitacion buscarHabitacionPorID(int id)
	{
		Iterator<Habitacion> itr = this.getIterator();
		Habitacion habitacion;
		while (itr.hasNext())
		{
			habitacion = itr.next();
			if (habitacion.getIDHabitacion() == id)
			{
				return habitacion;
			}
		}
		return null;
	}
	private int elegirAlAzarNumHabitaciones() {
		return (int)(Math.random()*5)+5;
	}
	private void crearResidentes()
	{
		ListaResidentes.getListaResidentes().crearResidentes();
	}
	public void crearCasa()
	{
		int numHabitaciones = this.elegirAlAzarNumHabitaciones();
		int habitacionElegida;
		for (int i=1; i<=numHabitaciones; i++) {
			habitacionElegida = (int)(Math.random()*3)+1;
			switch (habitacionElegida) {
			case (1):
				Cocina cocina = new Cocina(i);
				this.lista.add(cocina);
			break;
			case (2):
				Cuarto cuarto = new Cuarto(i);
				this.lista.add(cuarto);
			break;
			case (3):
				Banio banio = new Banio(i);
				this.lista.add(banio);
			break;
			}
		}
		this.crearResidentes();
	}
	public void comprobarSiHaPerdido()
	{
		ListaResidentes.getListaResidentes().haPerdido();
	}
	public void moverResidentes()
	{
		ListaResidentes listaResidentes = ListaResidentes.getListaResidentes();
		listaResidentes.moverResidentes(this.getNumHabitaciones());
	}
	
	//Acabado
}
