class Shape {
public double calculateArea() {
        return 0;
    }
}
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
        public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }    public double calculateArea() {
        return length * width;
    }
}
public class Main {
        public static void main (String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,8.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
