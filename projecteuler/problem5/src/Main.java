/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Main {
    public static void main(String[] args) {
        int number = 20;
        while (true){
            if (isEvenlyDivisible(number,20)){
                System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + number);
                break;
            }
            number++;
        }
    }

    public static boolean isEvenlyDivisible(int number, int limit){
        for (int i = 2; i <= limit; i++){
            if (number % i != 0){
                return false;
            }
        }
        return true;
    }
}