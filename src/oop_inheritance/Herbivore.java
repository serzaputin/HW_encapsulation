package oop_inheritance;

public class Herbivore extends Mammal {
    public String typeFood;

    public Herbivore(String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.equals("")) {
            this.typeFood = "default";
        } else {
            this.typeFood = typeFood;
        }
    }

    public void grazer() {

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


    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public void walk() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}