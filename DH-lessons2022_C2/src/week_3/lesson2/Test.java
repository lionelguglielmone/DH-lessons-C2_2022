package week_3.lesson2;

public class Test {

    public static void main(String[] args) {
        Perro firulais = new Perro();

        firulais.setNombre("firulais");
        Duenio lionel = new Duenio("lionel", firulais);

        System.out.println("El nombre de la mascota es: " + lionel.getMascota().getNombre());

    }

}
