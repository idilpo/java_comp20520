public class Cat extends Animal {

    public static final int LION = 0;
    public static final int HOUSE_CAT = 1;

    private int type;
    private String breed;

    public Cat(int age, int speed, int type, String breed) {
        super(age, speed);

        if (type < 0 || type > 1) {
            throw new IllegalArgumentException("Unknown Cat type: " + type);
        }

        if (breed == null || breed.trim().equals("")) {
            throw new IllegalArgumentException("Breed cannot be empty");
        }

        this.type = type;
        this.breed = breed;
    }

    @Override
    public String getTypeString() {
        String s;
        switch (type) {
            case 0: s = "Lion"; break;
            case 1: s = "House Cat"; break;
            default: s = "Unknown";
        }

        return "Cat (" + breed + ": " + s + ")";
    }

    public String getBreed() {return breed;}
    public int getType() {return type;}

    @Override
    public Animal[] multiply(int n) {
        if (n > 0) {
            Animal[] a = new Animal[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Cat(0, getSpeed(), type, breed);
            }
            return a;
        } else {
            throw new IllegalArgumentException("n cannot be less than 1; provided: " + n);
        }
    }

    public boolean equals(Object o) {
        if (o instanceof Cat) {
            return super.equals(o) && ((Cat)o).getBreed().equals(breed) && ((Cat)o).getType() == type;
        } else {
            return super.equals(o);
        }
    }
}
