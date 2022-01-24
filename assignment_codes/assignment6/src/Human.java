
public interface Human extends Comparable<Human> {
    int getAge();
    String getName();
    String toString();
    int compareTo(Human h);

}
