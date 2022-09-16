package week_7.lesson3;

public class Finalizado implements ArticuloState{

    private Articulo articulo;

    public Finalizado(Articulo articulo){
        this.articulo = articulo;
    }

    @Override
    public void valorPresupuesto(Double presupuesto){
        System.out.println("Operacion invalida");
    };
    @Override
    public void sumarRepuesto(Double c){
        System.out.println("Operacion invalida");

    };
    @Override
    public void cambiarDireccion(String s){
        System.out.println("Operacion invalida");

    };
    @Override
    public void pasarSigPaso(){
        System.out.println("El producto ha sido reparado y entregado");
    };
}
