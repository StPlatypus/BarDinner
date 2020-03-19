package principal;

public abstract class Habitacion {
	
	//atributos
	
	protected int idHabitacion;
	protected ListaResidentes listaR;
	protected int metrosCuadrados;
	protected int botinTotal;
	
	//constructora
	
	public Habitacion()
	{
		this.idHabitacion = this.asignarIDHabitacion();
		this.metrosCuadrados = this.asignarMetrosCuadrados();
		this.botinTotal = this.asignarBotinTotal();
		
	}
	
	//metodos
	
	protected abstract int asignarMetrosCuadrados();
	
	protected abstract int asignarBotinTotal();
	
	public int getMetrosCuadrados()
	{
		return this.metrosCuadrados;
	}
	
	public int getBotinTotal()
	{
		return this.botinTotal;
	}
	
	public int getNumResidentes()
	{
		return this.listaR.obtenerNumResidentes();
	}
	
	public boolean tienesteid(int pidHabitacion) {
		boolean iguales=false;
		if (this.idHabitacion==pidHabitacion) {
			iguales=true;
		}
		return iguales;
	}
	public int getId() {
		return this.idHabitacion;
	}
}