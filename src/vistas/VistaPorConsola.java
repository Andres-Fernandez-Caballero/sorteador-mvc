package vistas;

import interfaces.IVista;

public class VistaPorConsola implements IVista{

    public VistaPorConsola() {
    }

    @Override
    public void mostrarSorteado(String sorteado) {
        System.out.println(sorteado);
    }
}
