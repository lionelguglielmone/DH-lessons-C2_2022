package week_5.segundaPracticaParcial;

public class Corta extends Arma{
    //atributos
    private Boolean esAutomatica;

    //constructor

    public Corta(Policia policia, Boolean esAutomatica, Integer alcance) {
        super(policia, alcance);
        this.esAutomatica = esAutomatica;
    }

    //metodos
    public Boolean puedeSerDisparadaAMasDe200Mts(){
        /*if (getAlcance()>=200){
            return true;
        } else {
            return false;
        }*/
        return getAlcance()>=200;
    }
}
