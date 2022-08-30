package week_5.lesson2;

public abstract class Examen {

    //atributos
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private Double nota;

    //constructor


    public Examen(Alumno alumno, Double nota) {
        this.alumno = alumno;
        this.nota = nota;
    }

    abstract public Boolean estaAprobado();

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
