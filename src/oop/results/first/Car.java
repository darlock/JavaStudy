package oop.results.first;

public class Car {
    String name;
    int doors;
    int wheels;
    String color;
    int speed;
    String state;

    Car(String name, int doors, int wheels, String color, int speed, String state) {
        this.name = name;
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
        this.speed = speed;
        this.state = state;
    }

    Car() {
        this("mitsubishi", 5, 4, "black", 0, "stopped" );
    }

    void showInfo() {
        System.out.println(this.name + " (" + this.doors + "," + this.wheels + "," + this.color + ") " + this.state + " speed " + this.speed + " km/h");
    }

    void start() {
        this.state = "go";
        this.speed = 10;
    }

    void stop() {
        this.state = "stopped";
        this.speed = 0;
    }

    void accelerate(int howmuch) {
        this.speed = this.speed + howmuch;
    }

    void slowdown(int howmuch) {
        this.speed = this.speed - howmuch;
        if (this.speed < 0) this.speed=0;
    }
}
