package week_9.lesson1;

public class Seguidor implements Observer{
    private String apeNom;
    private Integer cantNotificaciones;

    public Seguidor(String apeNom) {
        this.apeNom = apeNom;
        this.cantNotificaciones = 0;
    }
    @Override
    public void update(String s){
        System.out.println(this.apeNom + " fue notificado de: " + s);
        this.cantNotificaciones ++;
    }
    


}
