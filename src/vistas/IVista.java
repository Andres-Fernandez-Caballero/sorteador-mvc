package vistas;

import java.awt.event.ActionListener;

public interface IVista {

	void mostrarSorteado(String sorteado);
	void mostrarError(String mensaje);
	void mostrarMenuInicial();
	void mostrarMenuAcciones();
	String getRuta();
	void addSortearListener(ActionListener al);
}