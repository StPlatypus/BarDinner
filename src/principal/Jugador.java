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

	public void ruidoEnHabitacion() {
		Casa casa = Casa.getCasa();
		System.out.println("Introduzca el identificador correspondiente a la habitacion que quiere escuchar");
		int idHabitacion = Teclado.getTeclado().leerTeclado();
		Habitacion habi=casa.buscarHabitacionPorID(idHabitacion);
		if(habi.getNumResidentes() != 0) {
			System.out.println("He oido ruido. Parece que hay alguien.");
		}
		else 
		{
			System.out.println("Silencio. Parece que no hay nadie.");
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
		this.botin = 0;
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
