package data_structures;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car.txt";

        try {
            readFileAndPrint(textFilePath);

            LinkedList<String> linkedList = storeWordsInLinkedList(textFilePath);
            System.out.println("Linked List:");


            for (String word : linkedList) {
                System.out.println(word);
            }
            Stack<String> stack = storeWordsInStack(textFilePath);
            System.out.println("Stack:");

            Iterator<String> iterator = stack.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            System.out.println("Stack Operations:");
            stack.push("New Item");
            System.out.println("Peek: " + stack.peek());
            System.out.println("Search 'Stack': " + stack.search("Stack"));
            System.out.println("Pop: " + stack.pop());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    public static void readFileAndPrint(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        System.out.println("File Contents:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
    public static LinkedList<String> storeWordsInLinkedList(String filePath) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            linkedList.addAll(Arrays.asList(words));
        }
        reader.close();
        return linkedList;
    }
    public static Stack<String> storeWordsInStack(String filePath) throws Exception {
        Stack<String> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                stack.push(word);
            }
        }
        reader.close();
        return stack;
}

}
