import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs to the Map
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(1, "David"); // Overwrites the value for key 1

        // Display the Map
        System.out.println("Initial Map: " + students);

        // Access a value by key
        String name = students.get(2);
        System.out.println("Value for key 2: " + name);

        // Remove a key-value pair
        students.remove(3);
        System.out.println("After Removal: " + students);

        // Check if a key or value exists
        System.out.println("Contains key 1: " + students.containsKey(1));
        System.out.println("Contains value 'Alice': " + students.containsValue("Alice"));

        // Iterate over the Map
        System.out.println("Iterating over Map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the Map
        students.clear();
        System.out.println("Map after clearing: " + students);
    }
}
