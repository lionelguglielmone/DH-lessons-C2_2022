package week_7.lesson3;

import java.util.function.Predicate;

public class Articulo {
    private ArticuloState estadoActual;
    private String nombre;
    private Double costo;
    private String direccion;

    public Articulo(String nombre){
        this.nombre = nombre;
        this.costo = 0.0;
        this.estadoActual = new EnPresupuesto(this);
        this.direccion = "";
    }


    public ArticuloState getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(ArticuloState estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void valorPresupuesto(Double presupuesto){
        this.estadoActual.valorPresupuesto(presupuesto);
    }
    public void sumarRepuesto(Double costo){
        this.estadoActual.sumarRepuesto(costo);
    }

    public void cambiarDireccion(String s){
        this.estadoActual.cambiarDireccion(s);
    }

    public void cambiarEstado(){
        this.estadoActual.pasarSigPaso();
    }
}
