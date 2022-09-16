package week_7.lesson3;

public class ArticuloFactory {
    private static ArticuloFactory af = new ArticuloFactory();

    private ArticuloFactory(){

    }

    public Articulo fabricarArticulo(String tipoArticulo) {
        switch (tipoArticulo) {
            case "batidora":
                return new Caja();
            case "licuadora":
                return new Pelota();
            case "refrigerador":
                return new Pelota();
            default:
                System.out.println("producto inexistente");
                return null;
        }
    }


}
