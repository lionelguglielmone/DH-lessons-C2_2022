package week_6.lesson3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Jugador pablo = new Jugador("pablo", "DEFENSOR");
        Jugador maria = new Jugador("maria", "MEDIOCAMPISTA");
        Jugador albertina = new Jugador("albertina", "DELANTERO");
        EquipoNacional cuba = new EquipoNacional("Cuba");
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(pablo);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(maria);
        cuba.agregarJugador(albertina);
        cuba.agregarJugador(albertina);
        cuba.agregarJugador(albertina);

        List<Jugador> reservas = cuba.obtenerReservas();
        System.out.println("tamaño de resrrvas: " + reservas.size());
        for(Jugador j: reservas){
            System.out.println("posicion: " +j.getPosicion());
        }
        try {
            System.out.println("Cantidad DELANTERO:" + cuba.cantJugadores("DEFENSOR"));

        } catch(EquipoNacionalException ene){
            System.err.println(ene.getMessage());
        }

    }
}
