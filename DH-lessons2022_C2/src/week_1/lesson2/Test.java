package week_1.lesson2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        Integer diaNacimiento = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        Integer mesNacimiento = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        Integer anioNacimiento = scanner.nextInt();

        //quiero mostrar toda la info en una ficha
        System.out.println("************************************");
        System.out.println("**********FICHA DE PERSONA**********");
        System.out.println("************************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Iniciales: " + nombre.charAt(0) + "." + apellido.charAt(0) );
        System.out.println("Fecha de nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/"
        + anioNacimiento);
        System.out.println("************************************");
        System.out.println("************************************");


    }
}
