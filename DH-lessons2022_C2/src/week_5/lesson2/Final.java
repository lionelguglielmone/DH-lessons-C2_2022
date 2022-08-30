package week_5.lesson2;

public class Final extends Examen implements Comparable{
    //atributos
    private String descripcion;
    private Double notaOral;

    //constructor


    public Final(Alumno alumno, Double nota, String descripcion, Double notaOral) {
        super(alumno, nota);
        this.descripcion = descripcion;
        this.notaOral = notaOral;
    }

    //metodo
    public Boolean estaAprobado(){
        if(getNota()>=4 && this.notaOral>=4){
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object object){
        Final otroFinal = (Final)object;
        Double promedioEsteFinal = (this.notaOral + getNota())/2;
        Double promedioOtroFinal = (otroFinal.getNotaOral() + otroFinal.getNota())/2;
        if(promedioEsteFinal>promedioOtroFinal){
            return 1;
        } else if (promedioEsteFinal<promedioOtroFinal){
            return -1;
        } else {
            return 0;
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(Double notaOral) {
        this.notaOral = notaOral;
    }
}
