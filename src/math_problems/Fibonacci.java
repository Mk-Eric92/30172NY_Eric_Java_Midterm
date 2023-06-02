package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
        int count = 40;

        printFibonacciNumbers(count);
    }

    public static void printFibonacciNumbers(int count) {
        long[] fibonacci = new long[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println("Fibonacci Numbers:");

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
