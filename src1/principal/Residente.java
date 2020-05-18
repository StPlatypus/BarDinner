package principal;
public class Residente {
//private boolean noqueado;
private int idHabitacionActual;

public Residente(int pIDHabitacion) {
   
	this.idHabitacionActual = pIDHabitacion;

}

public boolean delatarAJugador() {
	Jugador jugador = Jugador.getJugador();
	if (this.idHabitacionActual == jugador.getIDHabitacion())
	{
		jugador.perderPartida();
		return true;
	}
	return false;
}
public void moverse(int nuevaID)
{
	this.idHabitacionActual = nuevaID;
}

/*public abstract int getProbabilidadNoqueo(){
	int prob=this.;
	if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else {prob=this.adulto.probNoqueo;} 
	return prob;
		}*/
}
