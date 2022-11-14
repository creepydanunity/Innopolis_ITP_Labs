import java.io.*;
import java.nio.channels.NonWritableChannelException;


public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("src/input.txt"); FileOutputStream out = new FileOutputStream("output.txt")){
            DataInputStream din = new DataInputStream(in);
            int a = din.readInt();
            int b = din.readInt();
            float c = (float) a / (float) b;

            DataOutputStream dout = new DataOutputStream(out);
            dout.writeInt(c);
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