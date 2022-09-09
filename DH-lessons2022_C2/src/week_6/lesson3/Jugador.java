package week_6.lesson3;

public class Jugador {
    private String nombreApellido;
    private String posicion;
    private Integer nroCamiseta;

    public Jugador(String nombreApellido, String posicion) {
        this.nombreApellido = nombreApellido;
        this.posicion = posicion;
    }

    public String getPosicion(){
        return this.posicion;
    }

}
