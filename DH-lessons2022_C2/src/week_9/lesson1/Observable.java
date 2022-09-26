package week_9.lesson1;

public interface Observable {

    void agregar(Observer o);
    void quitar(Observer o);
    void notificar(String s);

}
