public class Array {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5};
        int target = 4;
        int index = -1; // Default value if target is not found
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break; // Exit the loop once the target is found
            }
        }
        
        System.out.println("Index of target is: " + index);
    }
}
