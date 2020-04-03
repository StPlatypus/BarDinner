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
		boolean hay_alguien=false;
		Casa casa = Casa.getCasa();
		Habitacion habi=casa.buscarHabitacionPorID(pIdHabitacion);
		if(habi.getNumResidentes() != 0) {
			hay_alguien=true;
		}
		return hay_alguien;
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
	/*public void golpearResidente() {
		
	}
	*/
}
