package principal;
public class Residente {
//private boolean noqueado;
private int idHabitacionActual;

public Residente(int pIDHabitacion) {
   
	this.idHabitacionActual = pIDHabitacion;

}

public void delatarAJugador() {
	boolean delatar =false;
	Jugador jugador = Jugador.getJugador();
	if (this.idHabitacionActual == jugador.getIDHabitacion())
	{
		jugador.perderPartida();
	}
}

/*public abstract int getProbabilidadNoqueo(){
	int prob=this.;
	if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else {prob=this.adulto.probNoqueo;} 
	return prob;
		}*/
}
