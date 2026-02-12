package test.img;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//import java.io.IOException;


public class move {
    public static void main(String[] args) throws IOException {

        String sourcePath = "C:\\Users\\Hemant\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-12-05 161735.png";
        String destinationPath = "D:\\davidjavafiles\\New folder\\Output Fol\\New Bitmap image.bmp";
        try {
            InputStream fis = new FileInputStream(sourcePath);
            OutputStream out = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            System.out.println("Copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}