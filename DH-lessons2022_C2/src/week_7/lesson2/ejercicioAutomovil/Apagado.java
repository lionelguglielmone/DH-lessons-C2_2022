package week_7.lesson2.ejercicioAutomovil;

public class Apagado implements AutoState{
    private Auto auto;

    public Apagado(Auto auto){
        this.auto = auto;
    }

    public void acelerar(){
        System.out.println("El vehiculo esta apagado. No puede acelerar");
    }

    public void contacto(){
        System.out.println("Ahora el auto esta encendido");
        this.auto.setEstadoActual(new Parado(this.auto));
    }

    public void frenar(){
        System.out.println("El vehiculo esta apagado. No puede frenar");
    }
}
