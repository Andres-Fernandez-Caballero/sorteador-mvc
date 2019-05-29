package modelos.modelo_archivo;

import modelos.IModelo;
import utils.LectorTexto;
import utils.Sorteador;

import java.io.IOException;

public class ModeloConArchivos implements IModelo {

    private Sorteador<String> sorteador;

    public ModeloConArchivos(){
        this.sorteador = new Sorteador<>();
    }
    @Override
    public void cargarSorteador(String ruta) throws IOException {
        LectorTexto lectorTexto = new LectorTexto(ruta);
        sorteador.insertar(lectorTexto.leerLineas());
    }

    @Override
    public void reiniciar() {
        this.sorteador.reiniciar();
    }

    @Override
    public String proximoSorteado() {
        return sorteador.proximoSorteado();
    }
}
