package edu.bdeb.a13.liskovSubstitutionPrinciple;

public class Circle implements Form {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
