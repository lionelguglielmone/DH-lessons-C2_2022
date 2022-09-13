package week_7.lesson2.ejercicioAutomovil;

public class Test {
    public static void main(String[] args) {
        Auto autoDeLio = new Auto(100);
        System.out.println("estado actual: " + autoDeLio.getEstadoActual());
        autoDeLio.acelerar();
        autoDeLio.contacto();
        autoDeLio.acelerar();

    }
}
