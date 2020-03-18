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

}
