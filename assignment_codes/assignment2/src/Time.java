
public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public static void main(String[] args) {
        Time morning = new Time();
        morning.hours = 14;
        morning.minutes = 15;
        morning.seconds = 12;
        morning.printTime();

        Time morning1 = new Time();
        morning1.hours = 04;
        morning1.minutes = 05;
        morning1.seconds = 02;
        morning1.printTime();

        Time morning2 = new Time();
        morning2.hours = 15;
        morning2.minutes = 05;
        morning2.seconds = 9;
        morning2.printTime();

        Time morning3 = new Time();
        morning3.hours = 01;
        morning3.minutes = 23;
        morning3.seconds = 45;
        morning3.printTime();
    }

    public void printTime() {
        System.out.printf("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}

