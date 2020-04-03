package principal;

public class Salon extends Habitacion{
	//constructora
	
	public Salon()
	{
		super();
	}
		
	//metodos
	/*protected int asignarMetrosCuadrados() 
	{
		return (int)(Math.random()*15)+5;
	}*/
		
	protected int asignarBotinTotal() 
	{
		return (int)(Math.random()*1300)+200;
	}
}
