package principal;

public abstract class Habitacion {
	
	//atributos
	
	private int idHabitacion;
  //private int metrosCuadrados;
	private int botinTotal;
	
	//constructora
	
	public Habitacion(int pID)
	{
		this.idHabitacion = pID;
	  //this.metrosCuadrados = this.asignarMetrosCuadrados();
		this.botinTotal = this.asignarBotinTotal();
		
	}
	
	//metodos
	
  //protected abstract int asignarMetrosCuadrados();
	
	protected abstract int asignarBotinTotal();
	
	/*
	public int getMetrosCuadrados()
	{
		return this.metrosCuadrados;
	}
	*/
	public int getIDHabitacion()
	{
		return this.idHabitacion;
	} 
	public int saquear()
	{
		int botin = this.botinTotal;
		this.botinTotal = 0;
		return botin;
	}
	
	
}
