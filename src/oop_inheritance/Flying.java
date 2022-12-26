package oop_inheritance;

public class Flying extends Bird {
    private String typeMovement;

    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        if (typeMovement == null || typeMovement.equals("")) {
            this.typeMovement = "default";
        } else {
            this.typeMovement = typeMovement;
        }
    }

    public void fly() {

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
    public void hunting() {

    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
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