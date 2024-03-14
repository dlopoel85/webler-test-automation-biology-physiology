package hu.webler.domain;

public class Omnivore extends Animal {

    public Omnivore() {

    }

    public Omnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating plants and meet!");
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "name" + super.getName() +
                "ages" + super.getAge() +
                "colors" + Array.toString(this.getColors()) +
                "gender" + super.getGender();

    }
}
