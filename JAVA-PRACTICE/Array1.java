public class Array1 {
    
        public static void main(String[] args) {
            int arr[] = {4, 6, 2, 7, 8, 6, 2, 1};
            int t1 = 2;
            int newT1 = 5;
            int t2 = 7;
            int newT2 = 8;
            
            // Loop through the array and make replacements
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == t1) {
                    arr[i] = newT1;
                }
                if (arr[i] == t2) {
                    arr[i] = newT2;
                }
            }
            
            // Print the modified array
            System.out.print("Modified array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
    

