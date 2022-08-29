package week_4.sundayStreaming;

public abstract class Pelicula {
    //atributos
    private String nombre;
    private Integer duracion;
    private String fecha;
    private String director;
    private String clasificacion;

    //constructor
    public Pelicula(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }


    //metodos

    //implementar la siguiente logica: se debe poder promocionar la pelicula independientemente
    //de su tipo. En el caso de LargoMetraje, se promociona en cines nacionales. Si es
    //CortoMetraje, se promociona en cines barrio
    public abstract void promocionarPelicula();

    public Boolean esATP(){
        return clasificacion.equals("ATP");
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDirector() {
        return director;
    }

    public String getClasificacion() {
        return clasificacion;
    }
}
