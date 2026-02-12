package test.img;

import java.io.FileOutputStream;
import java.io.IOException;

public class append {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hemant\\OneDrive\\Desktop\\FileHandling\\vie.txt";
        String text = "\nThis line is appended";

        FileOutputStream fos = new FileOutputStream(path, true);
        fos.write(text.getBytes());
        fos.close();

        System.out.println("Text appended successfully!");
    }
}
