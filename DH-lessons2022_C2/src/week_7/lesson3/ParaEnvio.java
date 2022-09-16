package week_7.lesson3;

public class ParaEnvio implements ArticuloState{

    private Articulo articulo;


    public ParaEnvio(Articulo articulo){
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
        this.articulo.setDireccion(s);
    };
    @Override
    public void pasarSigPaso(){
        System.out.println("Nombre: " + this.articulo.getNombre());
        System.out.println("Estado actual: " + this.articulo.getEstadoActual());
        System.out.println("Costo actual: " + this.articulo.getCosto());
        System.out.println("Direccion actual: " + this.articulo.getDireccion());
        this.articulo.setEstadoActual(new Finalizado(this.articulo));
    };
}
