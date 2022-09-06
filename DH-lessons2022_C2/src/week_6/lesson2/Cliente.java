package week_6.lesson2;

public class Cliente {
    private String nombreApellido;
    private String dni;
    private Double saldoEnCuenta;
    private Double deuda;
    private Double limite;

    public Cliente(String nombreApellido, String dni, Double limite) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.limite = limite;
        this.deuda = 0.0;
        this.saldoEnCuenta = 0.0;
    }

    public void cargarSaldo(Double monto){
        this.saldoEnCuenta += monto;
    }

    public void comprar(Double importe) throws ClienteException {
        Double disponibleCompra = this.limite-this.deuda;
        if (disponibleCompra<importe){
            throw new ClienteException("Operacion invalida. Importe es mayor al disponible.");
        }
        this.deuda += importe;
        System.out.println("La operacion ha sido exitosa");
    }
    public void saldarDeuda(Double monto){
        this.deuda -= monto; //excepcion si deuda<monto
        this.saldoEnCuenta -= monto; // excepcion si no tengo monto

    }



}
