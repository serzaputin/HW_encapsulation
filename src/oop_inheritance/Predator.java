package oop_inheritance;

public class Predator extends Mammal {
    public String typeFood;

    public Predator(String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.equals("")) {
            this.typeFood = "default";
        } else {
            this.typeFood = typeFood;
        }
    }

    public void hunting() {

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
    public void walk() {

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
    public String toString() {
        return super.toString();
    }
}