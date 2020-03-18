package principal;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Habitacion> lista;
	private static Casa listahab;
	
	private Casa() {
		this.lista=new ArrayList<Habitacion>();
	}
	
	public Casa getCasa() {
		if(Casa.listahab==null) {
			Casa.listahab= new Casa();
		}
		return Casa.listahab;
	}
	private Iterator<Habitacion> getIterator(){
		return this.lista.iterator();
	}
}
