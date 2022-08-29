package week_5.lesson1;

public abstract class Cuenta {

    //atributos
    private Double saldo;

    //constructor
    public Cuenta(Double saldo){
        this.saldo = saldo;
    }

    //metodos
    public void depositar(Double monto){
        this.saldo += monto;
    }
    public Double informarSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double newSaldo){
        this.saldo = newSaldo;
    }

    public abstract void extraer (Double monto);

}
