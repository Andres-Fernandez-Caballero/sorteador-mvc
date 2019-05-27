package utils;

import java.util.Scanner;

public class Consola {
	private static Scanner sc = new Scanner(System.in);
	
	/**
     * Lee un caracter desde la consogit la
     * return msj El mensaje a mostrar
     */
	public static char leerCaracter() { 
		char letra = sc.nextLine().charAt(0); // Lee una cadena y obtiene el primer caracter
		return letra;
	}
	
	/**
     * Lee un entero desde la consola
     * @param msj El mensaje a mostrar
     */
	public static int leerEntero() {
		int entero = Integer.parseInt(sc.nextLine()); // Lee una cadena y convierte a entero
		return entero;
	}

	public static String leerCadena() {
		String cadena = sc.nextLine();
		return cadena;
	}

}
