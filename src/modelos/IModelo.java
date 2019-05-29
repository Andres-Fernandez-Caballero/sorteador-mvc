package modelos;

import java.io.IOException;

public interface IModelo {

    void cargarSorteador(String ruta) throws IOException;
    void reiniciar();
    String proximoSorteado();
}
