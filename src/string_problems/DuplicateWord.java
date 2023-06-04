package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here

        Map<String, Integer> wordCount = findDuplicateWords(st);
        double averageLength = calculateAverageLength(st);

        System.out.println("Duplicate Words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
        System.out.println("Average Word Length: " + averageLength);
    }

    public static Map<String, Integer> findDuplicateWords(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static double calculateAverageLength(String sentence) {
        String[] words = sentence.split("\\W+");
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        return (double) totalLength / words.length;
    }

}
