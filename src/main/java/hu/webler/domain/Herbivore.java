package hu.webler.domain;

public class Herbivore extends Animal {

    public Herbivore() {

    }

    public Herbivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender );

    }

    @Override
    public void feed() {
        System.out.println("Lot of plants!");
    }

    @Override
    public void move() {
        System.out.println("Rabbit can jump");
    }
}
