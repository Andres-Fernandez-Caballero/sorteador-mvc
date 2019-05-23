package modelos;

import interfaces.IModelo;
import utils.LectorTexto;
import utils.Sorteador;

import java.io.IOException;

public class ModeloConArchivos implements IModelo {



    private Sorteador<String> lista;

    public ModeloConArchivos() {
        this.lista = new Sorteador<>();
    }


    @Override
    public void cargarSorteador(String ruta) throws IOException {
        LectorTexto lectorTexto = new LectorTexto(ruta);
        lista.insertar(lectorTexto.leerLineas());
    }

    @Override
    public String proximoSorteado() {
        return lista.proximoSorteado();
    }

}
