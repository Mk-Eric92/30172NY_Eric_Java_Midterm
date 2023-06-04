package data_structures;

import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);

        list.remove(1);


        System.out.println("Data using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("Data using while-loop with iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("Storing and retrieving data from a database table:");

        for (String element : list) {

            System.out.println("Inserting into database: " + element);
        }

        for (String element : list) {
            System.out.println("Retrieved from database: " + element);
        }

    }

}
