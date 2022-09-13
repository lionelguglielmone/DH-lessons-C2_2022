package week_7.lesson2.ejercicioAutomovil;

public class Auto {

    private AutoState estadoActual;
    private Integer combustible;
    private Integer velocidad;

    public Auto(Integer combustible){
        this.combustible = combustible;
        this.estadoActual = new Apagado(this);
        this.velocidad = 0;
    }

    public void setEstadoActual(AutoState nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

    public void setVelocidad(Integer velocidad){
        this.velocidad = velocidad;
    }

    public AutoState getEstadoActual() {
        return estadoActual;
    }

    public Integer getCombustible() {
        return combustible;
    }

    public void setCombustible(Integer combustible) {
        this.combustible = combustible;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void acelerar(){
        this.estadoActual.acelerar();
    }

    public void contacto(){
        this.estadoActual.contacto();
    }

    public void frenar(){
        this.estadoActual.frenar();
    }
}
