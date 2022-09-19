package week_7.practicaFinal;

public class Test {
    public static void main(String[] args) {

        UnidadFactory uf = UnidadFactory.getInstance();
        Unidad mantenimiento = uf.fabricar("mantenimiento");
        mantenimiento.mostrar();
        Unidad limpieza = uf.fabricar("limpieza");
        limpieza.mostrar();
        Unidad servicioGral = uf.fabricar("serviciosGenerales");
        servicioGral.mostrar();
        Unidad otro = uf.fabricar("cualquier otro");


    }
}
