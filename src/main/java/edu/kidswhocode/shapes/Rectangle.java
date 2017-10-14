package edu.kidswhocode.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, int x, int y, String color) {
        super(x, y, color);
        this.width = width;
        this.height= height;

    }

    @Override
    public double calculateArea() {
        return width * height;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "height=" + height +
                super.toString()+

                '}';
    }
}
