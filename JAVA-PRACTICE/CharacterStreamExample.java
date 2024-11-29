import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("output.txt")) {
            
            int data;
            while ((data = fr.read()) != -1) { // Read character by character
                fw.write(data); // Write character by character
            }
            System.out.println("File copied successfully using character streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
