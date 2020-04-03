package principal;

public class Cuarto extends Habitacion{
	//constructora
	
	public Cuarto()
	{
		super();
	}
				
	//metodos
	protected int asignarMetrosCuadrados() 
	{
		return (int)(Math.random()*20)+8;
	}
			
	protected int asignarBotinTotal() 
	{
		return (int)(Math.random()*1700)+500;
	}
}
