package oop.learning.first;

public class Main {

    public static void main(String[] args) {

        Child viki = new Child();   // Create first object (class instance)
        viki.age = 1;               // Change object attributes
        viki.height = 80;
        viki.weight = 8;
        viki.sex = "female";
        viki.showInfo();            // Call object method
        viki.weightIncrease();      // Call object method, that modifies its state/attribute
        viki.showInfo();

        Child kate = new Child(31, 171, 69, "female");  // Create object with different constructor
        kate.showInfo();

        Child krystof = new Child();    // Create object with
        krystof.showInfo();
    }
}
