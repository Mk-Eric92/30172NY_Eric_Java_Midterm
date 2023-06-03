package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    public static boolean primeNumber(int p) {
        for (int i = 2; i <= p/i; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Prime number from 2 to 100000 are: ");
        int minimum = 2, maximum = 100000;
        for (int p = minimum; p <+ maximum; p++) {
            if (primeNumber(p)) {
                System.out.print(p + " ");
            }
        }
    }

}
