package controlador;

import interfaces.IModelo;
import interfaces.IVista;

import java.io.IOException;

public class Controlador {
	
	private IModelo modelo;
	private IVista vista;
	
	public Controlador(IModelo modelo, IVista vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar(){

        vista.mostrarMenuInicial();
	    try{
            modelo.cargarSorteador(vista.getRuta());
            vista.mostrarMenuAcciones();
        }catch (IOException e){
	        vista.mostrarError(e.getMessage());
        }
	    vista.mostrarSorteado(vista.getRuta());
	}
	

}
