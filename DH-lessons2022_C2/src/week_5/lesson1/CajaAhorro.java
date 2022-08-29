package week_5.lesson1;

public class CajaAhorro extends Cuenta{

    //atributos
    private Double interesCajaAhorro = 1.2;

    //constructor
    public CajaAhorro(Double saldo){
        super(saldo);

    }

    //metodos
    public void extraer(Double monto){
        if (monto > informarSaldo()){
            System.out.println("No puede extraer un monto mayor al que posee");
        } else {
            setSaldo(informarSaldo()-monto);
        }
    }


}
