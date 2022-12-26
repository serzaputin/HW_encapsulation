package oop_inheritance;

public abstract class Mammal extends Animal {
    public String livingEnvironment;
    public String movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, String movementSpeed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.equals("")) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (livingEnvironment == null || livingEnvironment.equals("")) {
            this.movementSpeed = "default";
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    abstract public void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public String getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(String movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}