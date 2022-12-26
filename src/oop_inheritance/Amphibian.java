package oop_inheritance;

public class Amphibian extends Animal {
    public String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.equals("")) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void moveAround() {

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public void hunting() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}