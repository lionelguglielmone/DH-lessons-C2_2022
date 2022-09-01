package week_5.segundaPracticaParcial;

public class Larga extends Arma implements Comparable{
    //atributos
    private Boolean tieneSelloRenar;
    private String descripcion;
    private Integer nivel;
    //constructor
    public Larga(Policia policia, Integer alcance, Integer nivel){
        super(policia, alcance);
        this.nivel = nivel;
    }
    //metodos
    @Override
    public int compareTo(Object o){
        //1er paso: castear
        Larga largaOtra = (Larga)o;
        //2do paso: agrego logica
        if (this.nivel > largaOtra.getNivel()){
            return 1;
        } else if (this.nivel<largaOtra.getNivel()){
            return -1;
        }
        return 0;
    }

    public Integer getNivel(){
        return this.nivel;
    }
}
