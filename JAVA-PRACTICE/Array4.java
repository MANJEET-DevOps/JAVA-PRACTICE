public class Array4 {
    
    
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4};
    
            // Convert the array to a number
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                number = number * 10 + arr[i];
            }
    
            // Add the value 5
            number = number * 10 + 5;
    
            // Print the result
            System.out.println("New number after adding 5: " + number);
        }
    }
    

