package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {

        String word = "GAME";
        computePermutations(word);
    }
    // Implement Here
    public static void computePermutations(String word) {
        permute(word, 0, word.length() - 1);
    }

    public static void permute(String word, int left, int right) {
        if (left == right) {
            System.out.println(word);
        } else {
            for (int i = left; i <= right; i++) {
                word = swap(word, left, i);
                permute(word, left + 1, right);
                word = swap(word, left, i);
            }
        }
    }

    public static String swap(String word, int i, int j) {
        char[] chars = word.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
