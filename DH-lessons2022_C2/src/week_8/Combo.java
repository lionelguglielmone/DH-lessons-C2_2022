package week_8;

import java.util.ArrayList;

public class Combo implements Producto{
    private String nombre;
    private Double descuento;
    private ArrayList<Producto> productosDelCombo;

    public Combo(String nombre, Double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.productosDelCombo = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productosDelCombo.add(p);
    }

    @Override
    public Double obtenerPrecio() {
        Double precioFinalSinDesc = 0.0;
        for(Producto p: this.productosDelCombo){
            precioFinalSinDesc += p.obtenerPrecio();
        }
        Double precioFinalConDesc = precioFinalSinDesc*(1-this.descuento);

        return precioFinalConDesc;
    }
}
