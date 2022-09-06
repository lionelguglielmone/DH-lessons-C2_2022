package week_6.lesson1;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }


    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void removeJugador(int pos){
        for(int i=0; i<this.jugadores.size(); i++) {
            if(this.jugadores.get(i).getNombre().equals(nombre)){
                this.jugadores.remove(i);
            }
        }
    }

    public void mostrarJugadoresTitulares(){
        for (Jugador jugadorActual: this.jugadores){
            if(jugadorActual.getEsTitular()){
                System.out.println(jugadorActual.getNombre());
            }
        }
    }

    public Integer obtenerCantidadDeLesionados(){
        Integer cantJugLesionados = 0;
        for(int i=0; i<this.jugadores.size(); i++) {
            if(this.jugadores.get(i).getEstaLesionado()) {
                cantJugLesionados ++;
            }
        }
        return cantJugLesionados;
    }

}
