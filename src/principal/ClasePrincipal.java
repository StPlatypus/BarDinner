package principal;

public class ClasePrincipal {
	
public ClasePrincipal() {}
	
	public void jugarUnaPartida() 
	{
		Casa casa = Casa.getCasa();
		casa.crearCasa();
		System.out.println("Este es un juego por turnos de manera que debe de esperar a que se completen todas las acciones antes de poder ejecutar la siguiente");
		System.out.println("Usted ha entrado en una casa con "+ casa.getNumHabitaciones() +". Su objetivo es robar todo lo que pueda y salir sin ser visto.");
		System.out.println("Cuando se le pida ejecutar una accion, utilice el teclado.");
		System.out.println("Para moverse introduzca un numero entre 1 y "+ casa.getNumHabitaciones() +"(el numero total de habitaciones que hay).");
		System.out.println("Para saquear la habitacion introduzca el numero 0 por el teclado. Recuerde que saquear una habitacion tambien supondra un turno.");
		System.out.println("Para salir de la casa introduzca cualquier numero que no este en el rango de habitaciones y que no sea 0 por teclado.");
		System.out.println("Si coincide usted con algun residente de la casa, este lo delatara y perdera la partida. ");
		System.out.println("Empezamos");
		Jugador jugador = Jugador.getJugador();
		Teclado teclado = Teclado.getTeclado();
		casa.crearCasa();
		int entradaTeclado;
		
		while (jugador.getIDHabitacion() != 0 && !jugador.haPerdido())
		{
			entradaTeclado = teclado.leerTeclado();
			if (entradaTeclado >= 0 && entradaTeclado <= casa.getNumHabitaciones())
			{
				jugador.cambiarHabitacion(entradaTeclado);
				casa.moverResidentes();
				casa.
			}
		}
	}
}
