package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

            int number = 5;

            // Using recursion
            int factorialRecursive = calculateFactorialRecursive(number);
            System.out.println("Factorial (Recursive): " + factorialRecursive);

            // Using iteration
            int factorialIterative = calculateFactorialIterative(number);
            System.out.println("Factorial (Iterative): " + factorialIterative);
        }

        // Method to calculate factorial using recursion
        public static int calculateFactorialRecursive(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorialRecursive(n - 1);
            }
        }

        public static int calculateFactorialIterative(int n) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }



