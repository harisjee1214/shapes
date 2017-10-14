package edu.kidswhocode.shapes;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;

    }

    public abstract double calculateArea();

    public double calculateArea(int scale) {
        return calculateArea() / scale;

    }

    public void rotate(int degrees){
        System.out.println("Rotate is not implemented yet")
    }

    @Override
    public String toString() {
        return ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", area=" + calculateArea();
    }
}
