import java.io.*;
import java.nio.channels.NonWritableChannelException;


public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("src/input.txt"); FileOutputStream out = new FileOutputStream("output.txt")){
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);

        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch(NonWritableChannelException ex) {
            System.out.println("Non-writable output file");
        }
        catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }
}