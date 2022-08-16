package week_3.lesson1;

public class Perro {
    private String identificacion;
    private String nombre;
    private String raza;

    //constructor
    public Perro(String nombre){
        this.nombre = nombre;
    }

    //metodos
    public void ladrar(){
        System.out.println("Woof woof");
    }

}
