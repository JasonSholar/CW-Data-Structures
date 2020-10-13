import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

    // ArrayLists / HashMap all elements inside must be the same
    // ArrayList<String> is an arraylist of strings

    // Array vs Arraylist

    // Array is specific location in memory, you cannot change the size

    // typee variable name- new ObjectType
    // ArrayList<Integer> otherArray = new ArrayList<Integer>(3);

    // String[] myArray = {"A", "B", "C"};

    // String myString = "I really love ice cream";

    // String[] stringArray = myString.split(" ");

    // List <String> arrayList = new ArrayList<String>();

    ArrayList<String> fruitList = new ArrayList<>();

    public Array() {
    }

    public void run() {

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");

        for (String iterator : fruitList) {
            System.out.println(iterator);
        }

        // System.out.println(otherArray.size());
        // otherArray.add(5); //Add a number from the rear
        // otherArray.add(10);
        // otherArray.add(15);
        // otherArray.add(20);
        // otherArray.add(25);
        // otherArray.add(30);
        // otherArray.add(0,0); //Add a number to a specific position
        // otherArray.remove(3);
        // Collections.reverse(otherArray); //From collections class, passes in a list
        // System.out.println(otherArray.toString());
        // System.out.println();
        // System.out.println(otherArray.size());
        // System.out.println(otherArray.get(3));
        // for (int i = 0; i < stringArray.length; i++) {
        // System.out.println(stringArray[i] + ", ");

        // }
        // System.out.print("]");
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();

        // arrayList = Arrays.asList(stringArray);

        // System.out.println(arrayList);
        // otherArray.clear();
        // System.out.println(otherArray.size());

    }
}