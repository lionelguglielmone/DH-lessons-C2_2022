package week_7.lesson1.factory;

public class Test {
    public static void main(String[] args) {
        GaseosaFactory gf = GaseosaFactory.getInstance();
        Gaseosa gc1 = gf.fabricarGaseosa("colaChica");


        /*
        GaseosaCola gc1 = new GaseosaCola("Bicho Cola", 1.5);
        GaseosaCola gc2 = new GaseosaCola("Bicho Cola", 1.5);
        GaseosaCola gc3 = new GaseosaCola("Bicho Cola", 1.5);
        GaseosaCola gc4 = new GaseosaCola("Bicho Cola", 1.5);
        GaseosaCola gc5 = new GaseosaCola("Bicho Cola", 1.5);
        GaseosaNaranja gc6 = new GaseosaNaranja("Bicho Naranja", 2.0);
        GaseosaNaranja gc7 = new GaseosaNaranja("Bicho Naranja", 2.0);
        GaseosaNaranja gc8 = new GaseosaNaranja("Bicho Naranja", 2.0);
        GaseosaNaranja gc9 = new GaseosaNaranja("Bicho Naranja", 2.0);
        GaseosaNaranja gc10 = new GaseosaNaranja("Bicho Naranja", 2.0);
*/

    }
}
