package week_8.FinalPractice;

import java.util.ArrayList;

public class ComboNavideno extends Producto{

    private Double bonificacion;
    private ArrayList<Producto> componentes;

    public ComboNavideno(String qr, String detalle, Double bonificacion) {
        super(qr, detalle);
        this.bonificacion = bonificacion;
        this.componentes = new ArrayList<>();
    }

    public void agregarElemento(Producto p) {
        this.componentes.add(p);
    }

    @Override
    public Double obtenerPrecio(){
        Double totalSinDescuento = 0.0;
        for(Producto p: this.componentes){
            totalSinDescuento += p.obtenerPrecio();
        }
        Double totalConDescuento = totalSinDescuento*(1-this.bonificacion);
        return totalConDescuento;
    }


}
