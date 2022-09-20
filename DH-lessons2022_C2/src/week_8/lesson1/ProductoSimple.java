package week_8.lesson1;

public class ProductoSimple implements Producto{

    private String nombre;
    private Double precio;

    public ProductoSimple(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double obtenerPrecio() {
        return this.precio;
    }
}
