import controlador.Controlador;
import modelos.ModeloConArchivos;
import vistas.VistaPorConsola;

public class Principal {

	public static void main(String[] args) {

		ModeloConArchivos modelo = new ModeloConArchivos();
		VistaPorConsola vista = new VistaPorConsola();

		Controlador controlador = new Controlador(modelo,vista);

		controlador.iniciar();

	}

}
