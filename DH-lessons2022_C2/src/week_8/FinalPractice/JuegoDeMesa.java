package week_8.FinalPractice;

public class JuegoDeMesa extends Producto{

    private Double precio;
    private Boolean esNacional;

    public JuegoDeMesa(String qr, String detalle, Double precio, Boolean esNacional) {
        super(qr, detalle);
        this.precio = precio;
        this.esNacional = esNacional;
    }

    @Override
    public Double obtenerPrecio(){
        if(!esNacional){
            return this.precio*1.5;
        }
        return this.precio;
    }

}
