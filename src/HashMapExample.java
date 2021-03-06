import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    HashMap<String, Integer> person = new HashMap<>();

    public void run() {

        // key values
        person.put("Joan", 21);
        person.put("Anna", 34);
        person.put("Mike", 55);
        person.put("Daniel", 42);

        for (Map.Entry<String, Integer> iterator : person.entrySet()) {
            String key = iterator.getKey();
            Integer value = iterator.getValue();
            System.out.println(key + " is associated with " + value);
        }

    }
}

// show what the HashMap person looks like
// System.out.println(person);
// => {Joan=21, Mike=55, Daniel=42, Anna=34}

// .get retrieves data from the hash map
// Integer value = person.get("Joan");
// person.remove("Mike");
// returns the value associated with the key
// System.out.println(value);
// System.out.println(person);

// System.out.println(person.containsKey("Anna"));
// System.out.println(person.containsValue(42));
// System.out.println(person.isEmpty());
