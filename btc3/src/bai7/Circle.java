package bai7;

public class Circle {
    protected double radius=1.0;
    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
