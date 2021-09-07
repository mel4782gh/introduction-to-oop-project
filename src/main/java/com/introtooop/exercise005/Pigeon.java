package main.java.com.introtooop.exercise005;


public class Pigeon extends Bird {
    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
}
