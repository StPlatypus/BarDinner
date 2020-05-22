package principal;

public class Banio extends Habitacion{
	//constructora
	
	public Banio(int pID)
	{
		super(pID);
	}
	
	//metodos
	protected int asignarMetrosCuadrados() 
	{
		return (int)(Math.random()*5)+1;
	}
	
	protected int asignarBotinTotal() 
	{
		return (int)(Math.random()*150)+50;
	}
}
