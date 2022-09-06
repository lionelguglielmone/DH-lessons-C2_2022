package week_6.lesson1;

public class Test {
    public static void main(String[] args) {
        Equipo atlanta = new Equipo("Atlanta");



        atlanta.addJugador(new Jugador("messi",false,true));
        atlanta.addJugador(new Jugador("ronaldo",false,true));
        atlanta.addJugador(new Jugador("james",true, false));
        atlanta.addJugador(new Jugador("macera",false,false));

        atlanta.mostrarJugadoresTitulares();

        System.out.println("cantidad de lesionados " + atlanta.obtenerCantidadDeLesionados());

    }

}
