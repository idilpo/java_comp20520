
public abstract class Animal {

    private int age;
    private int speed;

    public Animal(int age, int speed) {

        if (age < 0 || speed < 0) {
            throw new IllegalArgumentException("invalid input");
        }

        this.age = age;
        this.speed = speed;

    }

    public int getAge() {return age;}
    public int getSpeed() {return speed;}

    // final bc q2-c: "Subclasses should not be able to modify this method."
    public final boolean isFaster(Animal a) {
        return getSpeed() > a.getSpeed();
    }

    public final boolean isOlder(Animal a) {
        return getAge() > a.getAge();
    }

    public String toString() {
        return getTypeString() + " is " + getAge() + " year" + (getAge() == 1 ? "" : "s") + " old, is " + getSpeed() + " units fast";
    }

    public boolean equals(Object o) {
        if (o instanceof Animal) {
            return ((Animal)o).getSpeed() == getSpeed() && ((Animal)o).getAge() == getAge();
        } else {return false;}
    }

    // an element of inheritance, forcing to have the method getType():
    protected abstract String getTypeString();
    public abstract Animal[] multiply(int amount);








}
