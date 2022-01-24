import java.io.*;
import java.util.Scanner;

public class Q1 {

    public static void writeFile() {
        String line = null;
        Scanner in = new Scanner(System.in);
        line = in.nextLine();

        try {
            File f = new File("message.txt");
            FileWriter writer = new FileWriter(f);
            writer.write(line);
            writer.flush();
        } catch (IOException ex) {ex.printStackTrace();}

    }

    public static void main(String[] args) {writeFile();}
}
