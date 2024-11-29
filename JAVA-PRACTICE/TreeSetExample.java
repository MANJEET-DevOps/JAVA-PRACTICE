import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();

        // Add elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("TreeSet (Sorted): " + cities);

        // Retrieve first and last elements
        System.out.println("First City: " + cities.first());
        System.out.println("Last City: " + cities.last());

        // Remove an element
        cities.remove("Chennai");
        System.out.println("After Removal: " + cities);
    }
}
