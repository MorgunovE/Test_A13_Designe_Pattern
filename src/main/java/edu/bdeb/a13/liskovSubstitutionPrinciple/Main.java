package edu.bdeb.a13.liskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Form rectangle = new Rectangle();
        ((Rectangle) rectangle).setWidth(5);
        ((Rectangle) rectangle).setHeight(10);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Output: 50

        Form square = new Square();
        ((Square) square).setWidth(5);
        System.out.println("Square area: " + square.getArea()); // Output: 25

        Form circle = new Circle();
        ((Circle) circle).setRadius(3);
        System.out.println("Circle area: " + circle.getArea()); // Output: 28 (approximately)
    }
}