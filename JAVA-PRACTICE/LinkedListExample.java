import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to the LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("Initial List: " + animals);

        // Add elements at specific positions
        animals.addFirst("Elephant"); // Add at the beginning
        animals.addLast("Zebra");    // Add at the end
        System.out.println("After Adding Elements: " + animals);

        // Access elements
        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());

        // Remove elements
        animals.removeFirst(); // Removes the first element
        animals.removeLast();  // Removes the last element
        System.out.println("After Removing Elements: " + animals);

        // Update an element
        animals.set(1, "Tiger");
        System.out.println("After Update: " + animals);

        // Iterate over elements
        System.out.println("Iterating over List:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Check if an element exists
        if (animals.contains("Dog")) {
            System.out.println("The list contains Dog");
        } else {
            System.out.println("Dog is not in the list");
        }

        // Clear the LinkedList
        animals.clear();
        System.out.println("List after clear: " + animals);
    }
}
