package week_8.FinalPractice;

public class ProductoFactory {
    private static ProductoFactory pf = new ProductoFactory();

    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        return pf;
    }

    public Producto fabricar(String s){
        switch (s){
            case "spiderman":
                return new Juguete("123AAA4FGH","spiderman action figure",4000.0,false);
            case "doctorStrange":
                return new Juguete("QR 123AAA4FFF", "strange action figure",3000.0, false);
            case "avengersAssemble":
                return new JuegoDeMesa("985AAA4MNK", "juego de mesa avengers", 8000.0, true);
            case "mundoMarvel":
                Juguete j1 = new Juguete("123AAA4FGH","spiderman action figure",4000.0,false);
                Juguete j2 = new Juguete("QR 123AAA4FFF", "strange action figure",3000.0, false);
                JuegoDeMesa jm = new JuegoDeMesa("985AAA4MNK", "juego de mesa avengers", 8000.0, true);
                ComboNavideno cn = new ComboNavideno("999ZZZ4FAA", "productos marvel para niños y niñas",0.25);
                cn.agregarElemento(j1);
                cn.agregarElemento(j2);
                cn.agregarElemento(jm);
                return cn;
            default:
                System.out.println("Producto inexsitente");
                return null;
        }
    }
}
