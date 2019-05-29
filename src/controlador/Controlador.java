package controlador;

import modelos.IModelo;
import vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	
	private IModelo modelo;
	private IVista vista;
	
	public Controlador(IModelo modelo, IVista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar(){
        //ruta C:\Users\lezzz\Desktop
		cargarListenersVista();
		vista.iniciarVista();
	}

	private void cargarListenersVista(){
		vista.addCargarListener(new CargarListeners() );
		vista.addReiniciarListener(new ReiniciarListener());
		vista.addSortearListener(new SortearListener());
	}

	private void cargarSorteador(){
		try{
			modelo.cargarSorteador(vista.getRuta());
		}catch (Exception e){
			vista.mostrarError(e.getMessage());
		}
	}

	private void sortear(){
		try{
			vista.mostrarSorteado(modelo.proximoSorteado());
		}catch (Exception e){
			vista.mostrarError(e.getMessage());
		}
	}

	private void reiniciar(){
		try{
			modelo.reiniciar();
			vista.mostrarInfo("Se ha reiniciado el sorteo");
		}catch (Exception e){
			vista.mostrarError(e.getMessage());
		}
	}

	private class SortearListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			sortear();
		}
	}

	private class ReiniciarListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			reiniciar();
		}
	}

	private class CargarListeners implements  ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			cargarSorteador();
		}
	}
}
