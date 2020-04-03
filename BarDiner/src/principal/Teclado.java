package principal;

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
{
	int entradaTeclado;
	entradaTeclado = sc.nextInt();
	System.out.println(entradaTeclado);
	return entradaTeclado;
}
}
