package principal;

public class Jugador {
		//atributos
			private int botin;
			private int idHabitacionActual;
			private static Jugador miJugador;

		//constructora
			private Jugador(int pBotin, int pIdHabitacionActual) {
				this.botin=pBotin;
				this.idHabitacionActual=pIdHabitacionActual;
				
			}
			public static Jugador getJugador() {
				if(miJugador==null) {
					miJugador=new Jugador();
			}
				
			return miJugador;}
			
			//otros metodos
		public void saquearHabtiacion() {
			Casa casa=Casa.getCasa();
			Habitacion habi=casa.getHabitacionPorID(this.idHabitacionActual);
			this.botin=this.botin +habi.getBotinTotal();
		}

		public boolean ruidoEnHabitacion(int pIdHabitacion) {
			boolean hay_alguien=false;
			Casa casa=Casa.getCasa();
			Habitacion habi=casa.getHabitacionPorID(pIdHabitacion);
			if(habi.getNumResidentes()>0) {
				hay_alguien=true;
			}
			return hay_alguien;
		}
		public void cambiarHabitacion(int pIdHabitacion) {
			this.idHabitacionActual=pIdHabitacion;
		}
		public void salirDeCasa() {
			this.idHabitacionActual=0;
		}
		public void golpearResidente() {
			
		}
}
