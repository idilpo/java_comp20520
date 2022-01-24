import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Abalone {
    private int sex, age;
    private double weight, length, diameter;

    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int INFANT = 2;

    public Abalone(int sex, double weight, double length, double diameter, int age) {

        validateSex(sex);
        validateNumber(weight, "Weight");
        validateNumber(length, "Length");
        validateNumber(diameter, "Diameter");
        validateNumber(age, "Age");

        this.sex = sex;
        this.diameter = diameter;
        this.age = age;
        this.weight = weight;
        this.length = length;

    }

    private void validateSex(int sex) {
        if (sex < 0 || sex > 2) {
            throw new IllegalArgumentException("Sex value inappropriate: " + sex);
        }
    }
    public int getSex() {return sex;}
    public void setSex(int sex) {
        validateSex(sex);
        this.sex = sex;
    }

    private void validateNumber(double d, String name) {
        if (d < 0) {
            throw new IllegalArgumentException(name + " cannot be negative");
        }
    }

    public int getAge() {return age;}
    public void setAge(int age) {
        validateNumber(age, "Age");
        this.age = age;
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {
        validateNumber(weight, "Weight");
        this.weight = weight;
    }

    public double getLength() {return length;}
    public void setLength(double length) {
        validateNumber(length, "Length");
        this.length = length;
    }

    public double getDiameter() {return diameter;}
    public void setDiameter(double diameter) {
        validateNumber(diameter, "Diameter");
        this.diameter = diameter;
    }

    public String toString() {
        String type = "";
        switch (getSex()) {
            case 0: type = "M"; break;
            case 1: type = "F"; break;
            default: type = "I";
        }
        return "Abalone (" + type + "), length=" + getLength() + ", diameter=" +
                getDiameter() + ", weight=" + getWeight() + ", age=" + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Abalone)) return false;
        Abalone abalone = (Abalone) o;
        return sex == abalone.sex &&
                age == abalone.age &&
                Double.compare(abalone.weight, weight) == 0 &&
                Double.compare(abalone.length, length) == 0 &&
                Double.compare(abalone.diameter, diameter) == 0;
    }

    public static ArrayList<Abalone> read(File f) throws IOException {
        ArrayList<Abalone> abalones = new ArrayList<Abalone>();

        BufferedReader in = new BufferedReader(new FileReader(f));
        String line;
        StringTokenizer st;

        String sex;
        int age;
        double weight, length, diameter;

        Abalone a;
        int s;

        while((line = in.readLine()) != null) {
            System.out.println(line);
            st = new StringTokenizer(line, ",");

            sex = st.nextToken();

            switch (sex) {
                case "M": s = Abalone.MALE; break;
                case "F": s = Abalone.FEMALE; break;
                case "I": s = Abalone.INFANT; break;
                default: throw new IllegalArgumentException("Invalid sex: " + sex);
            }

            weight = Double.parseDouble(st.nextToken());
            length = Double.parseDouble(st.nextToken());
            diameter = Double.parseDouble(st.nextToken());
            age = Integer.parseInt(st.nextToken());

            a = new Abalone(s, weight, length, diameter, age);
            abalones.add(a);
        }

        return abalones;
    }

    public static void main(String[] args) throws IOException {
        File f = new File(System.getProperty("user.dir") + "/src/Files/abalone.csv");
        ArrayList<Abalone> a = Abalone.read(f);
        for (Abalone abalone : a) {
            System.out.println(abalone);
        }

        File f1 = new File(System.getProperty("user.dir") + "/src/Files/invalidData6.csv");
        a = Abalone.read(f1);
    }

}
