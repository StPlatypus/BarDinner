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
	private Iterator<Residente> getIterador()
	{
		return this.listaR.iterator();
	}
	public static ListaResidentes getListaResidentes()
	{
		if (miListaU==null) { miListaU=new ListaResidentes();}
		return miListaU;
	}

	private int obtenerNumResidentes()
	{
		return listaR.size();
	}

	public void nuevoResidente(Residente pResidente)
	{
		listaR.add(pResidente);
	}
	public void quitarResidente(Residente pResidente)
	{
		
		listaR.remove(pResidente);
	}
	public boolean haPerdido()
	{
		boolean perdido = false;
		if (this.obtenerNumResidentes() > 0)
		{
			Residente residente;
			Iterator<Residente> itr = this.getIterador();
			while (itr.hasNext() && !perdido)
			{
				residente = itr.next();
				if (residente.delatarAJugador())
				{
					perdido = true;
				}
			}
		}
		return perdido;
	}
}
