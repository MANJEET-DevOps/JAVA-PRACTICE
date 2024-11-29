import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            int data;
            while ((data = fis.read()) != -1) { // Read byte by byte
                fos.write(data); // Write byte by byte
            }
            System.out.println("File copied successfully using byte streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
