package week_4.sundayStreaming;

public class Cortometraje extends Pelicula{
    //atributos
    private String origen;
    //constructor
    public Cortometraje(String origen, String nombrePelicula, String clasificacion){
        super(nombrePelicula, clasificacion);
        this.origen = origen;
    }
    //metodos
    @Override
    public void promocionarPelicula(){
        System.out.println("Promociono la pelicula en salas de barrio");
    }

    public Boolean esNacional(){
        return this.origen.equals("NACIONAL");
    }


}
