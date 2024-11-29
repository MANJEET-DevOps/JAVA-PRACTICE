public class Array3 {
  
        public static void main(String[] args) {
            int arr[] = {1, 5, 2, 3, 6, 7, 9};
            int newValue = 5; // New value to be inserted
    
            // Find the index of 3 (between 3 and 6)
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 3) {
                    index = i;
                    break;
                }
            }
    
            // If the value 3 was found, insert the new value
            if (index != -1) {
                // Create a new array with an extra space
                int[] newArr = new int[arr.length + 1];
    
                // Copy elements before the index
                for (int i = 0; i <= index; i++) {
                    newArr[i] = arr[i];
                }
    
                // Insert the new value
                newArr[index + 1] = newValue;
    
                // Copy remaining elements
                for (int i = index + 1; i < arr.length; i++) {
                    newArr[i + 1] = arr[i];
                }
    
                // Print the new array
                System.out.print("Modified array: ");
                for (int i : newArr) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("Value 3 not found in the array.");
            }
        }
    }
    
        


