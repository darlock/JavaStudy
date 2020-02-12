package oop.results.first;

public class Main {
    public static void main(String[] args) {

        Car skoda = new Car();
        skoda.name = "Skoda";
        skoda.showInfo();

        Car audi = new Car("Audi", 3, 4, "red", 0, "stopped");
        audi.showInfo();
        audi.start();
        audi.showInfo();
        audi.accelerate(100);
        audi.showInfo();
        audi.slowdown(80);
        audi.showInfo();
        audi.slowdown(50);
        audi.showInfo();
        audi.stop();
        audi.showInfo();
    }
}
