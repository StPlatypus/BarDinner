package principal;

public class Cocina extends Habitacion{
	//constructora
	
	public Cocina()
	{
		super();
	}
			
	//metodos
	protected int asignarMetrosCuadrados() 
	{
		return (int)(Math.random()*9)+3;
	}
			
	protected int asignarBotinTotal() 
	{
		return (int)(Math.random()*620)+80;
	}
}
