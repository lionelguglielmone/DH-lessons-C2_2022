package week_7.practicaFinal;

public class UnidadFactory {

    private static UnidadFactory uf = new UnidadFactory();

    private UnidadFactory(){

    }

    public static UnidadFactory getInstance(){
        return uf;
    }

    public Unidad fabricar(String tipoUnidad){
        switch (tipoUnidad){
            case "mantenimiento":
                return new Simple("mantenimiento","",4,120000.0);
            case "limpieza":
                return new Simple("limpieza","",24,100000.0);
            case "serviciosGenerales":
                Simple mantenimiento = new Simple("mantenimiento","",4,120000.0);
                Simple limpieza = new Simple("limpieza","",24,100000.0);
                Combinacion serviciosGenerales = new Combinacion("servicios generales","",3.0,0.0);
                serviciosGenerales.agregarUnidad(mantenimiento);
                serviciosGenerales.agregarUnidad(limpieza);
                return serviciosGenerales;
            default:
                System.out.println("Error");
                return null;
        }

    }

}
