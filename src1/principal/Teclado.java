package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
private static Teclado miTeclado = null;
private Scanner sc;

private Teclado() {
	
	this.sc = new Scanner(System.in);
	
}

public static Teclado getTeclado()
{
	if (miTeclado==null)
	{
		miTeclado = new Teclado();
	}
	return miTeclado;
}
public int leerTeclado()
{	int entradaTeclado=0;
boolean chivato=true;//chivato
while (chivato==true){//se hace loop hasta que se meta un valor aceptable
	try{
	entradaTeclado = sc.nextInt();
	System.out.println(entradaTeclado);
	chivato=false;
	
	}catch (InputMismatchException exception) //Esta excepcion salta cuando lo que recoge el scanner no coincide con lo que era en un principio
	{ 
	    System.out.println("Solo se pueden usar valores tipo entero."); 
	    sc.next();//Esto salta el valor no int y pasa al siguiente
	} }
	return entradaTeclado;
}
}
	