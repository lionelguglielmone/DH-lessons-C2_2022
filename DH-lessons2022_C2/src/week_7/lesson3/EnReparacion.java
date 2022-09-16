package week_7.lesson3;

public class EnReparacion implements ArticuloState{

    private Articulo articulo;

    public EnReparacion(Articulo articulo){
        this.articulo = articulo;
    }

    @Override
    public void valorPresupuesto(Double presupuesto){
        System.out.println("Operacion invalida");
    };
    @Override
    public void sumarRepuesto(Double costoAdicional){
        this.articulo.setCosto(this.articulo.getCosto() + costoAdicional);
    };
    @Override
    public void cambiarDireccion(String s){
        System.out.println("Operacion invalida");

    };
    @Override
    public void pasarSigPaso(){
        System.out.println("Nombre: " + this.articulo.getNombre());
        System.out.println("Estado actual: " + this.articulo.getEstadoActual());
        System.out.println("Costo actual: " + this.articulo.getCosto());
        System.out.println("Direccion actual: " + this.articulo.getDireccion());
        this.articulo.setEstadoActual(new ParaEnvio(this.articulo));
    };
}
