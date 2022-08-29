package week_4.sundayStreaming;

public class Largometraje extends Pelicula{
    //atributos
    private Integer cantidadActores;
    private String tema;
    //constructor
    public Largometraje(String nombre, String clasificacion, Integer cantidadActores) {
        super(nombre, clasificacion);
        this.cantidadActores = cantidadActores;
    }

    @Override
    public void promocionarPelicula(){
        System.out.println("Promociono la pelicula en salas nacionales");
    }
}
