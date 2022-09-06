package week_6.lesson2;

public class Test {
    public static void main(String[] args) {

        try {
            Cliente pepe = new Cliente("pepe pepo", "20123456", 500.0);
            pepe.cargarSaldo(5000.0);
            pepe.comprar(499.0);
        } catch(ClienteException e){
            System.err.println(e.getMessage());
        }

    }
}