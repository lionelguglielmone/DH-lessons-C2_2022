package week_6.lesson3;

import java.util.ArrayList;
import java.util.List;

public class EquipoNacional {
    private ArrayList<Jugador> jugadores;
    private String pais;

    public EquipoNacional(String pais) {
        this.pais = pais;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public ArrayList<Jugador> obtenerReservas2() {
        ArrayList<Jugador> jugadoresReserva = new ArrayList<>();
        for (int i = 18; i < this.jugadores.size(); i++) {
            jugadoresReserva.add(this.jugadores.get(i));
        }

        return jugadoresReserva;
    }

    public List<Jugador> obtenerReservas(){
        return this.jugadores.subList(18,23);
    }

    public Integer cantJugadores(String posicion) throws EquipoNacionalException{
        if(!posicion.equals("ARQUERO") || !posicion.equals("DEFENSOR") ||
                !posicion.equals("MEDIOCAMPISTA") || !posicion.equals("DELANTERO") ) {
            throw new EquipoNacionalException(posicion + " no es una posicion valida");
        }
        Integer cantidadJugadoresEnPosicion = 0;
        for(Jugador jugador: this.jugadores){
            if(jugador.getPosicion().equals(posicion)){
                cantidadJugadoresEnPosicion++;
            }
        }
        return cantidadJugadoresEnPosicion;
    }

}
