package principal;

public class Jugador {

	//atributos
		private int botin;
		private int idHabitacionActual;
		private boolean delatado;
		private static Jugador miJugador;

	//constructora
		private Jugador() {
			this.botin=0;
			this.idHabitacionActual=1;
			this.delatado = false;
			
		}
		public static Jugador getJugador() {
			if(miJugador==null) {
				miJugador=new Jugador();
				}
			return miJugador;}
		
		//otros metodos
	public void saquearHabtiacion() {
		Casa casa = Casa.getCasa();
		Habitacion habi = casa.buscarHabitacionPorID(this.idHabitacionActual);
		this.botin=this.botin +habi.getBotinTotal();
	}

	public boolean ruidoEnHabitacion(int pIdHabitacion) {
		if(ListaResidentes.getListaResidentes().obtenerNumResidentes(pIdHabitacion) != 0 && (Math.random()) <= 0.8) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void cambiarHabitacion(int pIdHabitacion) {
		this.idHabitacionActual=pIdHabitacion;
	}
	public void salirDeCasa() {
		this.idHabitacionActual = 0;
	}
	public int getIDHabitacion() {
		return this.idHabitacionActual;
	}
	public void perderPartida()
	{
		this.delatado = true;
	}
	public boolean haPerdido()
	{
		return this.delatado;
	}
	public int getBotin()
	{
		return this.botin;
	}
	/*public void golpearResidente() {
		
	}
	*/
}
