package week_5.lesson2;

public class Parcial extends Examen{
    //atributos
    private Integer nroUnidad;
    private Integer nroIntentos;

    //constructor

    public Parcial(Alumno alumno, Double nota, Integer nroUnidad, Integer nroIntentos) {
        super(alumno, nota);
        this.nroUnidad = nroUnidad;
        this.nroIntentos = nroIntentos;
    }


    //metodos
    public Boolean recuperar(){
        if(this.nroUnidad<=3 && this.nroIntentos<=3){
            this.nroIntentos ++;
            return true;
        } else if  (this.nroUnidad>3 && this.nroIntentos<=2) {
            this.nroIntentos ++;
            return true;
        } else {
            return false;
        }

    }

    public Boolean estaAprobado(){
        if(getNota()>=4){
            return true;
        } else {
            return false;
        }
    }

}
