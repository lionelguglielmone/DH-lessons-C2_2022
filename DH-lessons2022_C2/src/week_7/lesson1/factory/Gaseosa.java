package week_7.lesson1.factory;

public abstract class Gaseosa {
    private String nombreFantasia;
    private Double cantidadLitros;

    public Gaseosa(String nombreFantasia, Double cantidadLitros) {
        this.nombreFantasia = nombreFantasia;
        this.cantidadLitros = cantidadLitros;
    }
}
