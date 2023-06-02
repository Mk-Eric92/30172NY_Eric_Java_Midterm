package math_problems;

import java.util.HashSet;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        int lowestDifference = findLowestDifference(array1, array2);
        System.out.println("Lowest number not shared between the arrays: " + lowestDifference);
    }

    public static int findLowestDifference(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        int lowestDifference = Integer.MAX_VALUE;

        for (int num : array2) {
            if (!set.contains(num) && num < lowestDifference) {
                lowestDifference = num;
            }
        }

        return lowestDifference;
    }



}
