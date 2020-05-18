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

	public int obtenerNumResidentes()
	{
		return listaR.size();
	}

	private Iterator<Residente> getIterador()
	{
		Iterator <Residente> itr=this.listaR.iterator();
		return itr;
	}
	public void nuevoResidente(Residente pResidente)
	{listaR.add(pResidente);}
	
	public boolean haPerdido() 
	{
		Iterator<Residente> itr =this.getIterador();
		Residente residente;
		residente = itr.next();
		return residente.delatarAJugador();
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

}
