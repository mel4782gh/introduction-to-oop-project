package main.java.com.introtooop.exercise004;

public class Parrot extends Bird {
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Hey I'm " + name + " my feathers are " + color);
    }

}
