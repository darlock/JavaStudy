package oop.results.third;

public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc(3,4,5);
        System.out.println("Square area = " + calc.squareArea());
        System.out.println("Square perimeter = " + calc.squarePerimeter());
        System.out.println("Circle area = " + calc.circleArea());
        System.out.println("Circle perimeter = " + calc.circlePerimeter() );

        calc.setA(5);
        calc.setB(4);
        calc.setR(3);
        System.out.println("Square area = " + calc.squareArea());
        System.out.println("Square perimeter = " + calc.squarePerimeter());
        System.out.println("Circle area = " + calc.circleArea());
        System.out.println("Circle perimeter = " + calc.circlePerimeter() );

    }
}
