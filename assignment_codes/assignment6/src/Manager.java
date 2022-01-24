import java.util.ArrayList;
import java.util.Collections;

public class Manager extends Employee {

    private ArrayList<Employee> e = new ArrayList<Employee>();

    public Manager(String name, int age, String employer, int salary) {
        super(name, age, employer, salary);
    }

    public void addEmployee(Employee em) {e.add(em);}

    public int getSalary() {
        int s=0;
        for (int i=0; i<e.size(); i++) {
            s += e.get(i).getSalary();
        }
        return (s / e.size() + super.getSalary());
    }

    public ArrayList<Employee> getTeam() {return e;}

    public String toString() {
        return super.toString() + "[Team: " + getTeam().size() + "]";
    }

    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return super.equals(o);}
        Manager m = (Manager) o;
        return m.getTeam().size() == getTeam().size();
    }

    public int compareTo(Human h) {
        if (super.compareTo(h) == 0 && h instanceof Manager) {
            Manager e = (Manager) h;
            if (e.getTeam().size() > this.getTeam().size()) {return -1;}
            else if (e.getTeam().size() < this.getTeam().size()) {return 1;}
            else {return 0;}
        }
        return super.compareTo(h);
    }

    public static void main(String[] args) {

        /* tests for q3:
        Manager m = new Manager("Matthew", 41, "UCD", 50000);
        Employee e1 = new Employee("Edward", 24, "UCD", 35000);
        Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
        m.addEmployee(e1);
        m.addEmployee(e2);
        System.out.println(m);

        Manager m1 = new Manager("Matthew", 41, "UCD", 50000);
        Manager m2 = new Manager("Marvin", 50, "UCD", 60000);
        Employee e1 = new Employee("Edward", 24, "UCD", 35000);
        Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
        Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
        Employee e4 = new Employee("Emily", 34, "UCD", 42000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m2.addEmployee(m1);
        System.out.println(m1);
        System.out.println(m2);
        m1.addEmployee(e4);
        System.out.println(m1);
        System.out.println(m2);

        ArrayList<Human> p = new ArrayList<Human>();
        Manager m1 = new Manager("Matthew", 41, "UCD", 50000);
        Manager m2 = new Manager("Marvin", 50, "UCD", 60000);
        Employee e1 = new Employee("Edward", 24, "UCD", 35000);
        Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
        Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
        Employee e4 = new Employee("Emily", 34, "UCD", 42000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m2.addEmployee(m1);
        m1.addEmployee(e4);
        p.add(e1); p.add(e2); p.add(e3); p.add(e4);
        p.add(m1); p.add(m2);
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);

        ArrayList<Human> p = new ArrayList<Human>();
        Manager m1 = new Manager("Matthew", 50, "UCD", 70000);
        Manager m2 = new Manager("Marvin", 50, "UCD", 35000);
        Employee e1 = new Employee("Edward", 24, "UCD", 35000);
        Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
        Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
        Employee e4 = new Employee("Emily", 34, "UCD", 42000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m2.addEmployee(m1);
        m1.addEmployee(e4);
        p.add(e1); p.add(e2); p.add(e3); p.add(e4);
        p.add(m1); p.add(m2);
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);

        Manager m1 = new Manager("Matthew", 41, "UCD", 50000);
        Manager m2 = new Manager("Marvin", 50, "UCD", 60000);
        Employee e1 = new Employee("Edward", 24, "UCD", 35000);
        Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
        Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
        Employee e4 = new Employee("Emily", 34, "UCD", 42000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m2.addEmployee(m1);
        m1.addEmployee(e4);
        System.out.println(m1.compareTo(m2) + " " + m2.compareTo(m1) + " " + m1.compareTo(m1));
        System.out.println(m1.equals(m2) + " " + m2.equals(m1) + " " + m1.equals(m1));
        System.out.println(m1.compareTo(e1) + " " + m1.compareTo(e2) + " " + e1.compareTo(m1) + " " + e2.compareTo(m1));
        System.out.println(m1.equals(e1) + " " + m1.equals(e2) + " " + e1.equals(m1) + " " + e2. equals(m1));
        Employee e5 = new Employee(m1.getName(), m1.getAge(), m1.getEmployer(), m1.getSalary());
        System.out.println(e5.compareTo(m1) + " " + m1.compareTo(e5));
        System.out.println(e5.equals(m1) + " " + m1.equals(e5));

         */
    }
}
