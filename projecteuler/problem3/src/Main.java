/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

public class Main {
    public static final long product = 600851475143L;


    public static void main(String[] args) {
        System.out.println(getBiggestPrimeFactorOf(product));


    }

    public static long getBiggestPrimeFactorOf(long x) {
        long current = 2;
        long biggestFactor;
        while (true) {
            if (x % current == 0){
                biggestFactor = x / current;
                if (isPrime(biggestFactor)){
                    return biggestFactor;
                }
            }
            current++;
        }
    }

    public static boolean isPrime(long x){
        long counter = 2;
        do {
            if (x % counter == 0){
                return false;
            }
            counter++;
        } while (counter < x);
        return true;
    }
}