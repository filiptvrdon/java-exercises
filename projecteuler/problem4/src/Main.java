/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(findLargestPalindromeProduct(999,999));

    }

    public static long findLargestPalindromeProduct(int x, int y){
        boolean cond = false;
        int counter = x;
        while (counter > 0){
            long test = (long) counter * y;
            if (isPalindrome(String.valueOf(test))){
                return test;
            }
            counter--;
        }
        return 0;
    }
    public static boolean isPalindrome(String s){
        String[] stringArray = s.split("");
        StringBuilder reverse = new StringBuilder();
        for (int i = stringArray.length-1; i >= 0; i--){
            reverse.append(stringArray[i]);
        }
        System.out.println("Original number: " + s);
        System.out.println("Reverse number: " + reverse);
        return s.equals(reverse.toString());

    }
}