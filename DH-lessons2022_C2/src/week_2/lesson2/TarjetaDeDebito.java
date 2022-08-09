package week_2.lesson2;

import java.util.Calendar;

public class TarjetaDeDebito {

    //atributos
    private String nombreTitular;
    private Calendar fechaVenc;
    private String numeroTarjeta;
    private Double saldo;

    private Boolean estaListaParaUso;

    //constructor
    public TarjetaDeDebito(String nombreTitular){
        this.nombreTitular = nombreTitular;
    }

    public TarjetaDeDebito(String nombreTitular, String numeroTarjeta){
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
    }




    //metodos

    public String getNumeroTarjeta(){
        return this.numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getEstaListaParaUso() {
        return estaListaParaUso;
    }

    public void setEstaListaParaUso(Boolean estaLista){
        this.estaListaParaUso = estaLista;
    }

    public boolean pagar(Double monto){

        if (monto>this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.saldo = this.saldo - monto;
        System.out.println("Pagado");
        return true;
    }
    public boolean depositar(Double monto){
        //logica
        return true;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }


}
