
public class Dog extends Animal {

    public static enum type {HOUND, GUNDOG};
    private type t;
    private String breed;

    public Dog(int age, int speed, type t, String breed) {
        super(age, speed);
        this.t = t;

        if (breed == null || breed.trim().equals("")) {
            throw new IllegalArgumentException("Breed cannot be empty");
        }
        this.breed = breed;
    }

    @Override
    public String getTypeString() {
        return "Dog (" + getBreed() + ": " + getType().toString() + ")";
    }

    @Override
    public Animal[] multiply(int amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Cannot multiply 0 or fewer times");
        }

        Animal [] array = new Animal[amount];
        for (int i=0; i<amount; i++) {
            array[i] = new Dog(0, getSpeed(), getType(), getBreed());
        }
        return array;
    }

    public type getType() {return t;}
    public String getBreed() {return breed;}

    public static void main(String[] args) {
        Dog d = new Dog(1, 12, type.GUNDOG, "Irish Setter");
        System.out.println(d);

        Animal [] array = d.multiply(5);
        for (int i=0; i<array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }

}
