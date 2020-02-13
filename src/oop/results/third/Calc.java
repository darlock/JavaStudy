package oop.results.third;

public class Calc {
    private int a;
    private int b;
    private int r;

    public Calc(int a, int b, int r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public Calc() {
        this(0,0,0);
    }

    public int squarePerimeter() {
        return 2*this.a + 2*this.b;
    }

    public int squareArea() {
        return this.a * this.b;
    }

    public double circlePerimeter() {
        return 2 * Math.PI * this.r;
    }

    public double circleArea() {
        return Math.PI * this.r * this.r;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
