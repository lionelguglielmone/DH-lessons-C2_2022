package week_7.lesson1.singleton;

public class Test2 {
    public static void main(String[] args) {
        Calculadora calculadora = Calculadora.getInstance();
        System.out.println(calculadora.calcularPromedio(7.0,9.0));
        System.out.println(calculadora.toString());


    }

}
