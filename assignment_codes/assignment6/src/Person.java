import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Person implements Human {

    private String name;
    private int age;

    //constructor:
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        //validation checks:
        if (this.name == "" || this.name == " " || this.age <= 0 ) {
            throw new IllegalArgumentException("Failure");
        }
    }

    //getters and setters:
    public String getName() {return name;}
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    //methods:
    public String toString() {return this.getClass().getName() + ":[" + this.name + ", " + this.age + "]";}

    public boolean equals(Object o) {
        if (this == o) {return true;}
        //if (o == null || getClass() != o.getClass()) {return false;}
        Person p = (Person) o;
        return age == p.age && Objects.equals(name, p.name);
    }


    public int compareTo(Human h) {
       if (h.getAge() > this.age) {return -1;}
       else if (h.getAge() < this.age) {return 1;}
       else {return 0;}
    }

    public static void main(String[] args) {
        /* tests for q1:
        Human h = new Person("John", 21);
        Human i = new Person("Jane", 22);
        System.out.println(h);
        System.out.println(i);
       
        Human h1 = new Person("John", 21);
        Human i1 = new Person("John", 21);
        System.out.println(h1.equals(i1));

        Human h2 = new Person("John", 21);
        Human i2 = new Person("Jane", 21);
        System.out.println(h2.equals(i2));

        ArrayList<Human> p = new ArrayList<Human>();
        p.add(new Person("A", 1));
        p.add(new Person("B", 12));
        p.add(new Person("C", 122));
        p.add(new Person("D", 3));
        p.add(new Person("E", 21));
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);

        try {
            Human h3 = new Person("Jane", -22);
            System.out.println(h3);
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Human h4 = new Person(" ", 22);
            System.out.println(h4);
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        Human h5 = new Person("Jane", 25);
        String s = "Person:[Jane, 25]";
        System.out.println(h5.equals(s));
        System.out.println(s.equals(h5.toString()));

        Human h6 = new Person("Jane", 25);
        Double d = 25d;
        System.out.println(h6.equals(d));

        Human h7 = new Person("B", 12);
        Human i7 = new Person("C", 122);
        System.out.println(h7.compareTo(i7));
        System.out.println(i7.compareTo(h7));

*/

    }

}

