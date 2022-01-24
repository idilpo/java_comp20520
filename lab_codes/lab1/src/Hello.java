import java.sql.Date;

public class Hello {
    public static void main(String[] args) {
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.toString());
    }
}
