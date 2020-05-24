package principal;
import java.util.ArrayList;
import java.util.Iterator;



public class ListaResidentes {
private ArrayList <Residente> listaR;
	
	
	private static ListaResidentes miListaU;
	
	// constructora
	

	private ListaResidentes()
	{ 
		this.listaR= new ArrayList<Residente>();
	}

	// otros métodos

	public static ListaResidentes getListaResidentes()
	{
		if (miListaU==null) { miListaU=new ListaResidentes();}
		return miListaU;
	}

	public int obtenerNumResidentes(int idHabitacion)
	{
		Iterator<Residente> itr = this.getIterador();
		Residente residente;
		int numResidentesEnHabitacion = 0;
		while (itr.hasNext())
		{
			residente = itr.next();
			if (residente.getIDHabitacion()==idHabitacion)
			{
				numResidentesEnHabitacion = numResidentesEnHabitacion + 1;
			}
		}
		return numResidentesEnHabitacion;
	}

	private Iterator<Residente> getIterador()
	{
		Iterator <Residente> itr=this.listaR.iterator();
		return itr;
	}
	private void nuevoResidente(Residente pResidente)
	{
		listaR.add(pResidente);
	}
	
	public void haPerdido() 
	{
		Iterator<Residente> itr =this.getIterador();
		Residente residente;
		boolean haPerdido = false;
		while (itr.hasNext() && !haPerdido)
		{
			residente = itr.next();
			if (residente.delatarAJugador())
			{
				haPerdido = true;
			}
		}
	}
	public void crearResidentes()
	{
		Casa casa = Casa.getCasa();
		int numResidentes = (int)(Math.random()*2)+2;
		Residente residente;
		while (numResidentes != 0)
		{
			residente = new Residente((int)(Math.random()*casa.getNumHabitaciones()-1)+2);
			this.nuevoResidente(residente);
			numResidentes = numResidentes-1;
		}
	}
	public void moverResidentes(int numHabitaciones)
	{
		int probabilidad;
		Iterator<Residente> itr = this.getIterador();
		Residente residente;
		while (itr.hasNext())
		{
			residente = itr.next();
			probabilidad = (int)(Math.random()*10);
			if (probabilidad>=8)
			{
				residente.moverse((int)(Math.random()*numHabitaciones-1)+1);
			}
			
		} 
	}
	public void resetear()
	{
		this.listaR = new ArrayList<Residente>();
	}

}
