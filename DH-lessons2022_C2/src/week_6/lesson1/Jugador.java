package week_6.lesson1;

public class Jugador {
    private Integer nroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }
}
