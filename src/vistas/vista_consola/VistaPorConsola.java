package vistas.vista_consola;

import vistas.IVista;
import utils.Consola;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPorConsola implements IVista{

    private  String ruta;
    // escuchadores
    private ActionListener alSortear;
    private ActionListener alReiniciar;
    private ActionListener alCargar;


    // eventos
    private ActionEvent evtSortear;
    private ActionEvent evtReiniciar;
    private ActionEvent evtCargar;


    @Override
    public void mostrarSorteado(String sorteado) {
        System.out.println("Salio: " + sorteado);
    }

    @Override
    public void mostrarError(String mensajeError) {
        System.out.println("\\***ERROR: " + mensajeError + "***/");
    }

    @Override
    public void mostrarInfo(String mensaje) {
        System.out.println("\\***INFO: " + mensaje + "***/");
    }

    @Override
    public void iniciarVista() {
        char option;

        mostrar("Bienvenido al Sorteador");
        this.ruta = Consola.leerCadena("Ruta al archivo de datos");
        cargar();
        boolean seguimos = false;
        do {
            do {
                mostrar("[1] Sortear");
                mostrar("[2] Reiniciar");
                mostrar("[3] Salir");
                option = Consola.leerCaracter("");
            } while (option != '1' && option != '2' && option != '3');
            switch (option) {
                case '1':
                    sortear();
                    break;
                case '2':
                    reiniciar();
                    break;
                case '3':
                    seguimos = salir();
                    break;
                default:
                    mostrarError("Elija una opcion valida");
            }
        }while (seguimos);

    }

    private boolean salir() {
        return false;
    }

    private void mostrar(String texto) {
        System.out.println(texto);
    }

    @Override
    public void addSortearListener(ActionListener actionListener) {
        this.alSortear = actionListener;
        this.evtSortear = new ActionEvent(this,0,"Sortear");
    }

    @Override
    public void addReiniciarListener(ActionListener actionListener) {
        this.alReiniciar = actionListener;
        this.evtReiniciar = new ActionEvent(this,1,"Reiniciar");
    }

    @Override
    public void addCargarListener(ActionListener actionListener) {
        this.alCargar = actionListener;
        this.evtCargar = new ActionEvent(this,2,"Cargar");
    }

    @Override
    public String getRuta() {
        return this.ruta;
    }


    private void cargar(){
        this.alCargar.actionPerformed(evtCargar);
    }
    private void sortear(){
        this.alSortear.actionPerformed(evtSortear);
    }
    private void reiniciar(){
        this.alReiniciar.actionPerformed(evtReiniciar);
    }

}
