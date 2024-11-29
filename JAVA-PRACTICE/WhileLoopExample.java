public class WhileLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int i = 0;

        System.out.println("Iterating using While Loop:");
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
