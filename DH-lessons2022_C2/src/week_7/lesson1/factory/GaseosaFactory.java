package week_7.lesson1.factory;

public class GaseosaFactory {
    private static GaseosaFactory gf = new GaseosaFactory();

    private GaseosaFactory(){
    }

    public static GaseosaFactory getInstance(){
        return gf;
    }

    public static Gaseosa fabricarGaseosa(String nombreGaseosa){
        switch (nombreGaseosa){
            case "colaChica":
                return new GaseosaCola("Bicho cola",1.5);
            case "colaGrande":
                return new GaseosaCola("Bicho cola",3.0);
            case "narajaChica":
                return new GaseosaNaranja("Bicho naranja",1.5);
            case "narajaGrande":
                return new GaseosaNaranja("Bicho naranja",3.0);
            default:
                System.out.println("producto inexistente");
                return null;

        }

    }

}
