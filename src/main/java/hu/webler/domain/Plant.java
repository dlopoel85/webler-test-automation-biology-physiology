package hu.webler.domain;

public class Plant extends LivingCreature {

    public Plant() {


    }

    public Plant(String name, int age, String[] colors) {
        super(name, age, colors);

    }

    @Override
    void feed() {
        System.out.println("Lot of plants!");
    }

}
