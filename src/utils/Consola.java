package utils;

import java.util.Scanner;

public class Consola {
	private static Scanner sc = new Scanner(System.in);

	private Consola(){}
	
	/**
     * Lee un caracter desde la consola
     * return msj El mensaje a mostrar
     */
	public static char leerCaracter(String mensaje) {
		String cadena = leerCadena(mensaje);
		return cadena.charAt(0);
	}
	
	/**
     * Lee un entero desde la consola
     * @param msj El mensaje a mostrar
     */
	public static int leerEntero() {
		int entero = Integer.parseInt(sc.nextLine()); // Lee una cadena y convierte a entero
		return entero;
	}

	public static String leerCadena(String mensaje) {
		String comp = mensaje.isEmpty() ? ">" : ">";
		System.out.print(mensaje + comp);
		String cadena = sc.nextLine();
		while (cadena.isEmpty()){
			System.out.print("ERROR: " + mensaje + comp);
			cadena = sc.nextLine();
		}
		return cadena;
	}
}
