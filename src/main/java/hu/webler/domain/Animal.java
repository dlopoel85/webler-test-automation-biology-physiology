package hu.webler.domain;

public class Animal extends LivingCreature implements AnimalActivity, CommonActivity {

    private String gender;
    public Animal() {

    }

    public Animal(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;

    }
    @Override
    void feed() {
        System.out.println("Human is being fe. Yum yum yum. Animal food.");
    }

    @Override
    public void makeSound() {
        System.out.println("Animal have voice");
    }

    @Override
    public void move() {
        System.out.println("Animal can move");
    }

    @Override
    public void sleep() {
        System.out.println("Animal can sleep");
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



}
