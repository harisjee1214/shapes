package edu.kidswhocode.shapes;

public class ShapesApp {
    public static void main (String[] args)
    {
        Circle circle= new Circle(10,50, 50, "black");
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(7, 9, 50, 50, "red");
        System.out.println(rectangle);
        Triangle triangle= new Triangle(8, 4, 50, 50, "green");
        System.out.println(triangle);
        Square square= new Square(6, 50,50, "blue");
        System.out.println(square);
        System.out.println("Scaled Circle Area "+ circle.calculateArea(10));
        System.out.println("Scaled Rectangle Area "+ rectangle.calculateArea(10));
        System.out.println("Scaled Triangle Area "+ triangle.calculateArea(10));
        System.out.println("Scaled Square Area "+ square.calculateArea(10));

    }
}
