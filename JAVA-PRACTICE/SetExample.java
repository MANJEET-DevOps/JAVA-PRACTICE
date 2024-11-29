import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements to the Set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate element (won't be added)
        System.out.println("Set: " + numbers);

        // Check if an element exists
        if (numbers.contains(20)) {
            System.out.println("The set contains 20");
        } else {
            System.out.println("20 is not in the set");
        }

        // Remove an element
        numbers.remove(30);
        System.out.println("Set after removal: " + numbers);

        // Iterate over the elements
        System.out.println("Iterating over the set:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Get the size of the Set
        System.out.println("Size of the set: " + numbers.size());

        // Clear the Set
        numbers.clear();
        System.out.println("Set after clearing: " + numbers);
    }
}
