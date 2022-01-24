import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Employee extends Person {
    private String employer;
    private int salary;

    //constructor:
    public Employee(String name, int age, String employer, int salary) {
        super(name, age);
        this.employer = employer;
        this.salary = salary;
    }

    //getters:
    public String getEmployer() {return employer;}
    public int getSalary() {return salary;}

    public String toString() {
        return super.toString() + "[" + getEmployer() + ", " + getSalary() + "]";
    }

    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return super.equals(o);}
        Employee e = (Employee) o;
        return this.getSalary() == e.salary && e.getEmployer() == this.getEmployer() && super.equals(o);
    }

    public int compareTo(Human h) {
        if (super.compareTo(h) == 0) {
            Employee e = (Employee) h;
            if (e.getSalary() > this.getSalary()) {return -1;}
            else if (e.getSalary() < this.getSalary()) {return 1;}
            else {return 0;}
        }
        return super.compareTo(h);
    }

    public static void main(String[] args) {
        /* tests for q2:
        Human h = new Employee("John", 30, "UCD", 30000);
        System.out.println(h);

        Human h1 = new Employee("John", 30, "UCD", 30000);
        Human i1 = new Person("John", 30);
        System.out.println(h1.equals(i1));
        System.out.println(i1.equals(h1));

        Human h2 = new Employee("John", 31, "UCD", 30000);
        Human i2 = new Person("John", 30);
        System.out.println(h2.equals(i2));

        Human h3 = new Employee("John", 30, "UCD", 30000);
        Human i3 = new Employee("John", 31, "UCD", 30000);
        Human j = new Employee("John", 31, "UCD", 30001);
        Human k = new Employee("John", 31, "TCD", 30000);
        System.out.println(i3.equals(h3));
        System.out.println(h3.equals(h3));
        System.out.println(j.equals(h3));
        System.out.println(k.equals(h3));

        ArrayList<Human> p = new ArrayList<Human>();
        p.add(new Person("A", 1));
        p.add(new Employee("B", 31, "E1", 45000));
        p.add(new Person("C", 122));
        p.add(new Employee("D", 3, "E2", 54321));
        p.add(new Person("E", 21));
        p.add(new Employee("F", 31, "E1", 21000));
        p.add(new Employee("G", 31, "E1", 38000));
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);

        Human h4 = new Employee("John", 30, "TCD", 30000);
        Human i4 = new Employee("Jane", 31, "UCD", 40000);
        Human j4 = new Employee("James", 30, "TCD", 32000);
        Human k4 = new Employee("Joanna", 31, "UCD", 35000);
        Human l = new Person("Julie", 29);
        System.out.println(i4.compareTo(h4));
        System.out.println(h4.compareTo(h4));
        System.out.println(j4.compareTo(h4));
        System.out.println(k4.compareTo(h4));
        System.out.println(h4.compareTo(l));
        System.out.println(l.compareTo(h4));

        Employee h5 = new Employee("Jamie", 22, "EY", 80000);
        Employee i5 = new Employee("Joyce", 23, "KPMG", 90000);
        System.out.println(h5.getSalary() + " " + h5.getEmployer());
        System.out.println(i5.getSalary() + " " + i5.getEmployer());

         */
    }
}
