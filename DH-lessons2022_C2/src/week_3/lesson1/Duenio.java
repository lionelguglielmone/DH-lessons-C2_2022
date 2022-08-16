package week_3.lesson1;

public class Duenio {
    //atributos
    private String nombre;
    private String numeroCta;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    //constructor

    public Duenio(String nombre,Perro perro){
        this.nombre = nombre;
        this.perro1 = perro;
    }

    //metodos
    public void pagarServicio(Double monto){
        System.out.println("Se le cobra " + monto);
    }
}
