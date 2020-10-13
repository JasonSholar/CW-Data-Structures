import java.util.ArrayList;
import java.util.Scanner;

public class Animals {
  
    ArrayList<String> animals = new ArrayList<String>();

    String favAnimal;

    public void run(){

        Scanner userInput = new Scanner


        animals.add("pig");
        animals.add("horse");
        animals.add("chicken");
        animals.add("cow");
        animals.add("coyote");

        for (String animal : animals) {
            
            System.out.println();
            if (animal.equals(favAnimal)){
                System.out.println(animal + " is my favorite animal");
            } else {
                System.out.println(animals + " is not my favorite animal");
            }
        }

    }
}
