public class DoWhileExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int i = 0;

        System.out.println("Iterating using Do-While Loop:");
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}
