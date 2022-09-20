package week_8.lesson1;


public class Test {
    public static void main(String[] args) {

        ProductoSimple hamburguesa = new ProductoSimple("hamburguesa", 100.0);
        ProductoSimple papas = new ProductoSimple("papas fritas",80.0);
        Combo c1 = new Combo("combo 1", 0.2);
        c1.agregarProducto(hamburguesa);
        c1.agregarProducto(papas);

        System.out.println("El valor de los productos por separado es: " +
                (hamburguesa.obtenerPrecio() + papas.obtenerPrecio()));
        System.out.println("El valor en combo es: " + c1.obtenerPrecio());
    }
}
