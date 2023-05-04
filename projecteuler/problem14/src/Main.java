public class Main {
    private static final int UPPER_LIMIT = 1000000;

    public static void main(String[] args) {
        long maxChainLength = 0;
        int intWithMaxChainLength = 0;

        for (int i = 1; i <= UPPER_LIMIT; i++) {
            long currentChainLength = calculateColatzChainLength(i);
            if (currentChainLength > maxChainLength) {
                maxChainLength = currentChainLength;
                intWithMaxChainLength = i;
            }
        }

        System.out.println("Int with longest chain is " + intWithMaxChainLength + " with chain length of " + maxChainLength);
    }

    static long calculateColatzChainLength(int initialInt) {
        long manipulatedNumber = initialInt;
        long chainLength = 1;

        do {
            if (isOdd(manipulatedNumber)) {
                manipulatedNumber = processOddNumber(manipulatedNumber);
            } else {
                manipulatedNumber = processEvenNumber(manipulatedNumber);
            }
            chainLength++;

        } while (manipulatedNumber != 1);

        return chainLength;
    }

    public static boolean isOdd(long x) {
        return x % 2 != 0;
    }

    public static long processOddNumber(long x) {
        return x / 2;
    }

    public static long processEvenNumber(long x) {
        return x * 3 + 1;
    }
}