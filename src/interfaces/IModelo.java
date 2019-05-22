package interfaces;

import java.io.IOException;
import java.util.ArrayList;

public interface IModelo {

    void cargarSorteador(String ruta) throws IOException;
    String proximoSorteado();
}
