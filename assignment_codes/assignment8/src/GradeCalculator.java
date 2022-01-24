import java.io.*;

public class GradeCalculator {

    public static void readFile(String s) {
        try {
            File f = new File(s);
            BufferedReader in = new BufferedReader(new FileReader(f));
            String line;

            while ((line=in.readLine()) != null) {
                String[] result = line.split(", ");
                float grade = (float) (Float.parseFloat(result[1]) * 0.2 + Float.parseFloat(result[2]) * 0.3 + Float.parseFloat(result[3]) * 0.5);
                System.out.println(result[0] + " " + String.format("%.2g", grade) + ".0");
            }
            in.close();
        } catch (IOException ex) {ex.printStackTrace();}
    }

    public static void main(String[] args) {
        readFile("/Users/idilbilgic/Desktop/STAGE2.1/COMP20250/assignment_codes/assignment8/src/grades.csv");
    }
}


