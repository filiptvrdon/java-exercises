/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumOfMultiples(1000));
    }

    public static int calculateSumOfMultiples(int limit) {
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if (isMultipleOf3Or5(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isMultipleOf3Or5(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }
}