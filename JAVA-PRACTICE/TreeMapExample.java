import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        // Add key-value pairs
        employees.put(101, "John");
        employees.put(103, "Emma");
        employees.put(102, "Sophia");

        // Display the Map (sorted by key)
        System.out.println("TreeMap (Sorted): " + employees);

        // Access the first and last keys
        System.out.println("First Key: " + employees.firstKey());
        System.out.println("Last Key: " + employees.lastKey());

        // Iterate over the entries
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
