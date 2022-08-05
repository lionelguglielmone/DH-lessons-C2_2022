package week_1.lesson3;

public class PrimeNumberCalculator {

    //exercise PrimeNumbers
    //definition: k is a PN if only k%1=0 ^k%k=0 -> k is PN
    //definition: let k and j (dis) be 2 integers. k is not PN if k%j=0
    public boolean isPrimeNumber(Integer number) {
        //process
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
