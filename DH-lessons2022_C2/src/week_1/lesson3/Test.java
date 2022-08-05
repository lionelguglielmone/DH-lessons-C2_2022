package week_1.lesson3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner scannerPN = new Scanner(System.in);

        //input
        System.out.println("***********************************");
        System.out.println("****ADIVINADOR DE NUMEROS PRIMOS****");
        System.out.println("***********************************");
        System.out.println("Ingrese el numero: ");
        Integer numero = scannerPN.nextInt(); //is an integer



        PrimeNumberCalculator calc = new PrimeNumberCalculator();

        boolean esPrimo = calc.isPrimeNumber(numero);


        if(esPrimo){
            System.out.println("El numero: " + numero + " es primo");
        } else {
            System.out.println("El numero: " + numero + " NO es primo ");
        }

    }




}
