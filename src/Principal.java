import controlador.Controlador;
import modelos.modelo_archivo.ModeloConArchivos;
import vistas.vista_consola.VistaPorConsola;

public class Principal {

	public static void main(String[] args) {

		ModeloConArchivos modelo = new ModeloConArchivos();
		VistaPorConsola vista = new VistaPorConsola();

		Controlador controlador = new Controlador(modelo,vista);

		controlador.iniciar();

	}

}
