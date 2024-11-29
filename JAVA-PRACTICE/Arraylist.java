import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Access elements using an index
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Update an element
        fruits.set(1, "Blueberry");
        System.out.println("Updated List: " + fruits);

        // Remove an element by index
        fruits.remove(2); // Removes "Cherry"
        System.out.println("After Removing: " + fruits);

        // Check the size of the ArrayList
        System.out.println("Size of List: " + fruits.size());

        // Iterate over the elements
        System.out.println("Iterating over List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element exists
        if (fruits.contains("Apple")) {
            System.out.println("The list contains Apple");
        } else {
            System.out.println("Apple is not in the list");
        }

        // Clear all elements
        fruits.clear();
        System.out.println("List after clear: " + fruits);
    }
}
