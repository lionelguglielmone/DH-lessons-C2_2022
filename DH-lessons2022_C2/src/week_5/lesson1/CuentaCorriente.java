package week_5.lesson1;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable{

    private Double decubiertoPermitido;

    public CuentaCorriente(Double saldo, Double decubiertoPermitido) {
        super(saldo);
        this.decubiertoPermitido = decubiertoPermitido;
    }

    public void extraer (Double monto){
        //logica
    }

    public Double gravar(Double porcentaje) {
        
        return 2.0;
    }
}
