package week_8.lesson1;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> pedido;

    public Carrito() {
        this.pedido = new ArrayList<>();
    }

    public void agregarNuevoProducto(Producto p){
        this.pedido.add(p);
    }
}
