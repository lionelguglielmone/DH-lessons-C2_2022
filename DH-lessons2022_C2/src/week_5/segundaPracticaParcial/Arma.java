package week_5.segundaPracticaParcial;

public abstract class Arma {
    //atributos
    private Policia policia;
    private Integer cantMuniciones;
    private String marca;
    private Integer alcance;
    private Double calibre;
    private String estado;
    //constructor

    public Arma(Policia policia, Integer alcance) {
        this.policia = policia;
        this.alcance = alcance;
    }


    //metodos
    public Boolean puedeSerUsada(){
        /*
        if(this.calibre>=9 && this.estado.equals("EN USO")){
            return true;
        } else {
            return false;
        }
        */
        return this.calibre>=9 && this.estado.equals("EN USO");

    }

    public Integer getAlcance() {
        return alcance;
    }
}
