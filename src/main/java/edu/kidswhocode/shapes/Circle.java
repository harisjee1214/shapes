package edu.kidswhocode.shapes;

public class Circle extends Shape {
    private int radius;
    private static final double PI = 3.14;

    public Circle(int radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString()+

                '}';
    }
}
