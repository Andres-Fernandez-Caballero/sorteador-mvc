package vistas;

import java.awt.event.ActionListener;

public interface IVista {

	void mostrarSorteado(String sorteado);
	void mostrarError(String mensajeError);
	void mostrarInfo(String mensaje);
	void iniciarVista();

	//listeners
	void addSortearListener(ActionListener actionListener);
	void addReiniciarListener(ActionListener actionListener);
	void addCargarListener(ActionListener actionListener);

	String getRuta();
}