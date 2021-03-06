package edu.kidswhocode.shapes;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height, int x, int y, String color) {
        super(x, y, color);
        this.base = base;
        this.height= height;

    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                "height=" + height +
                super.toString()+

                '}';
    }
}
