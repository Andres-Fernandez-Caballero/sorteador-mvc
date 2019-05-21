package modelos;

import interfaces.IModelo;

public class ModeloConArchivos implements IModelo {


    public ModeloConArchivos() {
    }

    @Override
    public String tomarUnNombre() {
        return "un nombre aleatorio";
    }
}
