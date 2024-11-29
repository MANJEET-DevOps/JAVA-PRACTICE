public class Array5 {
    

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4};
            
            // Convert the array to a single integer
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                number = number * 10 + arr[i];
            }
    
            // Add 5 to the number
            number += 5;
            
            // Convert the number back to an array
            String numberStr = Integer.toString(number);
            int[] resultArr = new int[numberStr.length()];
            for (int i = 0; i < numberStr.length(); i++) {
                resultArr[i] = numberStr.charAt(i) - '0';
            }
    
            // Print the new array
            System.out.print("Modified array: ");
            for (int i : resultArr) {
                System.out.print(i + " ");
            }
        }
    }
    

