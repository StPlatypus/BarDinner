package principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Casa {
	private ArrayList<Habitacion> lista;
	private static Casa miCasa;
	
	private Casa() {
		this.lista=new ArrayList<Habitacion>();
		this.crearCasa();
	}
	
	public static Casa getCasa() {
		if(miCasa==null) {
			miCasa = new Casa();
		}
		return miCasa;
	}
	private Iterator<Habitacion> getIterator(){
		return this.lista.iterator();
	}
	public int getNumHabitaciones() {
		return this.lista.size();
	}
	public Habitacion buscarHabitacionPorID(int id)
	{
		if (id <= this.getNumHabitaciones())
		{
			Iterator<Habitacion> itr = this.getIterator();
			boolean es = false;
			Habitacion habitacion = null;
			while (itr.hasNext() && !es) {
				habitacion = itr.next();
				if (habitacion.getIDHabitacion() == id)
				{
					es = true;
				}
			}
			return habitacion;
		}
		else
		{
			System.out.println("La habitacion no existe");
			return null;
		}
	}
	private int elegirAlAzarNumHabitaciones() {
		return (int)(Math.random()*6)+4;
	}
	private void crearHabitaciones()
	{
		int numHabitaciones = this.elegirAlAzarNumHabitaciones();
		int habitacionElegida;
		while (numHabitaciones != 0) {
			habitacionElegida = (int)(Math.random()*3)+1;
			switch (habitacionElegida) {
			case (1):
				Cocina cocina = new Cocina();
				this.lista.add(cocina);
			break;
			case (2):
				Cuarto cuarto = new Cuarto();
				this.lista.add(cuarto);
			break;
			case (3):
				Banio banio = new Banio();
				this.lista.add(banio);
			break;
			}
			numHabitaciones = numHabitaciones --;
		}
	}
	public void crearCasa()
	{
		this.crearHabitaciones();
		this.crearResidentes();
		
	}
	private void crearResidentes()
	{
		double probabilidad;
		Residente residente;
		for (Habitacion habitacion : this.lista)
		{
			 probabilidad = (Math.random());
			 if (probabilidad>0.95) 
			 {
				 residente = new Residente(habitacion.getIDHabitacion());
				 this.buscarHabitacionPorID(habitacion.getIDHabitacion()).anadirResidente(residente);
			 }
			 if (probabilidad>0.7)
			 {
				 residente = new Residente(habitacion.getIDHabitacion());
				 this.buscarHabitacionPorID(habitacion.getIDHabitacion()).anadirResidente(residente);
			 }
		}
	}
	public void moverResidentes()
	{
		Habitacion habitacion;
		Iterator<Habitacion> itr = this.getIterator();
		int numResidentesEnMovimiento;
		while (itr.hasNext())
		{
			habitacion = itr.next();
		}
	}
	public void comprobarSiHaPerdido()
	{
		boolean perdido = false;
		Iterator<Habitacion> itr = this.getIterator();
		Habitacion habitacion;
		while (itr.hasNext() && !perdido)
		{
			habitacion = itr.next();
			perdido = habitacion.haPerdido();
		}
	}
}
