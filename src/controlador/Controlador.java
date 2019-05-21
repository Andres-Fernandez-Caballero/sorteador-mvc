package controlador;

import interfaces.IModelo;
import interfaces.IVista;

public class Controlador {
	
	private IModelo modelo;
	private IVista vista;
	
	public Controlador(IModelo modelo, IVista vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar(){

		System.out.println("Iniciando programa...");

		vista.mostrarSorteado(modelo.tomarUnNombre());
	}
	

}
