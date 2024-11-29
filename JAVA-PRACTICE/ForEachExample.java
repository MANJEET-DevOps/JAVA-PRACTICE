import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        // Create a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Iterating using For-Each Loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
