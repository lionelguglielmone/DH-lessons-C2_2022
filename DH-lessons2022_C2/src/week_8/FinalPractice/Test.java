package week_8.FinalPractice;

public class Test {
    public static void main(String[] args) {

    Jugueteria j = new Jugueteria();

    ProductoFactory pf = ProductoFactory.getInstance();
    Producto j1 = pf.fabricar("spiderman");
    Producto j2 = pf.fabricar("doctorStrange");
    Producto jm = pf.fabricar("avengersAssemble");
    Producto c = pf.fabricar("mundoMarvel");

    j.agregarProducto(j1);
    j.agregarProducto(j2);
    j.agregarProducto(jm);
    j.agregarProducto(c);

    j.mostrarCatalogo();

    }
}
