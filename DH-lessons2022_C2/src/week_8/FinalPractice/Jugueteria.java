package week_8.FinalPractice;

import java.util.ArrayList;

public class Jugueteria {
    private ArrayList<Producto> catalogo;

    public Jugueteria(){
        this.catalogo = new ArrayList<>();
    }

    public void mostrarCatalogo(){
        for(Producto p: this.catalogo){
            System.out.println("QR: " + p.getQr());
            System.out.println("Detalle: " + p.getDetalle());
            System.out.println("Precio: " + p.obtenerPrecio());

        }
    }

    public void agregarProducto(Producto p ){
        this.catalogo.add(p);
    }


}
