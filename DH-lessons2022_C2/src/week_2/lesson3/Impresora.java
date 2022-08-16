package week_2.lesson3;

import java.util.Calendar;

public class Impresora {
    //atributos
    private String modelo;
    private Boolean conexionInalambrica;
    private Calendar fechaFabricacion;
    private Integer cantHojas;
    private Boolean prendida;


    //constructor
    public Impresora(){
        cantHojas = 0;
        this.prendida = false;
    }

    public Impresora(Integer cantidadHojas){
        cantHojas = cantidadHojas;
        this.prendida = false;
    }

    //metodos
    public void prender(){
        this.prendida = true;
    }
    public void apagar(){
        this.prendida = false;
    }

    public void cargarHojas(Integer cantHojas){
        this.cantHojas += cantHojas;
    }

    public Boolean isPrendida(){
        return this.prendida;
    }

    public Integer getCantHojas(){
        return this.cantHojas;
    }

    public Boolean imprimir(String texto, Integer cantHojas){
        if(!this.prendida){
            System.out.println("Impresora apagada");
            return false;
        }
        if(this.cantHojas<cantHojas){
            System.out.println("no hay hojas");
            return false;
        }
        System.out.println("Su impresion: " + texto);
        this.cantHojas -= cantHojas;
        return true;
    }

    public void setFechaFabricacion(Calendar fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
}
