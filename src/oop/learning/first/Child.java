package oop.learning.first;

public class Child {                                            // This is class :-)

    int age;                                                    // Attributes definition
    int height;
    int weight;
    String sex;

    Child(int age, int height, int weight, String sex ) {       // Constructor with parameters
        this.age = age;                                         // set attributes values
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    Child() {                                                   // Constructor without parameters
        this(10, 100, 10, "male");      // call another constructor
    }

    void weightIncrease() {                                     // Method
        this.weight = this.weight + 1;
    }

    void showInfo() {                                           // Method
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Sex: " + this.sex);
    }
}
