package principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Casa {
	private ArrayList<Habitacion> lista;
	private static Casa listahab;
	
	private Casa() {
		this.lista=new ArrayList<Habitacion>();
	}
	
	public static Casa getCasa() {
		if(Casa.listahab==null) {
			Casa.listahab= new Casa();
		}
		return Casa.listahab;
	}
	private Iterator<Habitacion> getIterator(){
		return this.lista.iterator();
	}
	public Habitacion getHabitacionPorID(int pidHabitacion) {
		Iterator<Habitacion> itr=this.getIterator();
		Habitacion aux=null;
		while(itr.hasNext()) {
			aux=itr.next();
			if(aux.tienesteid(pidHabitacion)) {
				return aux;
			}
		}
		return null;
	}
	public void añadirHabitacion(Habitacion pHabitacion) {
		if(this.getHabitacionPorID(pHabitacion.getId())==null) {
			this.lista.add(pHabitacion);
		}
	}
	public int getNumHabitaciones() {
		return this.lista.size();

	}
	
	public int elegirAlAzarNunHabitaciones() {
		//formula para el random de habitaciones(int)(Math.random()*((max-min)+1))+min;
		 return (int)(Math.random()*((11)+1))+5;
	}
}
