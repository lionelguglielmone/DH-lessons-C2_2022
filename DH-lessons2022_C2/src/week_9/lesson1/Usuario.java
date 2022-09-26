package week_9.lesson1;

import java.util.ArrayList;

public class Usuario implements Observable{
    private String apeNom;
    private ArrayList<Observer> seguidores;
    private ArrayList<String> fotos;

    public Usuario(String apeNom) {
        this.apeNom = apeNom;
        this.seguidores = new ArrayList<>();
        this.fotos = new ArrayList<>();
    }

    @Override
    public void agregar(Observer o) {
        this.seguidores.add(o);
    }

    @Override
    public void quitar(Observer o) {
        this.seguidores.remove(o);
    }

    @Override
    public void notificar(String s) {
        for(Observer o: this.seguidores){
            o.update(s);
        }
    }

    public void agregarFoto(String s){
        this.fotos.add(s);
        notificar(this.apeNom + " acaba de agragr una foto");
    }

    public void darLike(){
        //operacion dar like
        notificar(this.apeNom + " dio like");
    }
}
