package vistas;

import interfaces.IVista;
import utils.Consola;

import java.awt.event.ActionListener;

public class VistaPorConsola implements IVista{

    private String ruta;
    private ActionListener actionListener;

    @Override
    public void mostrarSorteado(String sorteado) {
        System.out.println(sorteado);
    }

    @Override
    public void mostrarError(String mensaje) {
        System.err.println(mensaje);
    }

    @Override
    public void mostrarMenuInicial() {
        System.out.println("Bienvenido al Sorteador");
        System.out.println("Elija opcion");
        System.out.println("Escriba la ruta a los datos:");
        this.ruta =Consola.leerCadena();

    }

    @Override
    public void mostrarMenuAcciones() {
        char opcion = ' ';
        do{
            System.out.println("Eliga la opcion");
            System.out.println("[1] Sortear");
            System.out.println("[2] Reiniciar");
            System.out.println("[3} Salir");
        }while (opcion != '3');


    }

    @Override
    public String getRuta() {
        // c:\Users\lezzz\Desktop\sorteados.txt
        return this.ruta;
    }

    @Override
    public void addSortearListener(ActionListener al) {
        this.actionListener = al;



    }
}
