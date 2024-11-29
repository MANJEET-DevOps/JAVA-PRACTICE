import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            
            String line;
            while ((line = br.readLine()) != null) { // Read line by line
                bw.write(line); // Write line by line
                bw.newLine(); // Add a newline
            }
            System.out.println("File copied successfully using buffered streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
