package hu.webler.domain;

public class Human extends LivingCreature implements HumanActivity, CommonActivity {

    private String gender;

    public Human() {


    }

    public Human(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    void feed() {
        System.out.println("Human is being fe. Yum yum yum. Food food food.");

    }

    @Override
    public void speak() {
        System.out.println("Human speaking");
    }

    @Override
    public void think() {
        System.out.println("Human thinking");
    }

    @Override
    public void move() {
        System.out.println("Human can move");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps at night");
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



}
