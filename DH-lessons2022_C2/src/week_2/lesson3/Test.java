package week_2.lesson3;

import java.util.Calendar;

public class Test {

    public static void main(String[] args) {

    Impresora impresora = new Impresora();
    /*
    System.out.println("esta prendida: " + impresora.isPrendida());
    impresora.prender();
    System.out.println("esta prendida: " + impresora.isPrendida());
    System.out.println("cantidad de hojas: " + impresora.getCantHojas());

    impresora.cargarHojas(10);
    System.out.println("cantidad de hojas: " + impresora.getCantHojas());
    impresora.cargarHojas(10);
    System.out.println("cantidad de hojas: " + impresora.getCantHojas());
    */
    impresora.prender();
    impresora.cargarHojas(10);
    impresora.imprimir("Bienvenidos a la segunda semana de POO", 10);
    System.out.println("cantidad de hojas: " + impresora.getCantHojas());
    }
}
