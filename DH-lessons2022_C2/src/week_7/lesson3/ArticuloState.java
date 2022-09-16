package week_7.lesson3;

public interface ArticuloState {
    void valorPresupuesto(Double presupuesto);
    void sumarRepuesto(Double costoAdicional);
    void cambiarDireccion(String direccion);
    void pasarSigPaso();
}
