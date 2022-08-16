package week_3.lesson2;

public class Duenio {
    private String nombre;
    private Mascota mascota;

    public Duenio(String nombre, Mascota mascota){
        this.nombre = nombre;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
