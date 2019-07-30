package triangles;

public class Triangle implements Shape {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;


    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[" + name + "]: " + area + " cm";
    }

    private double calculateArea() {
        double p = calculateHalfPerimeter();

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private double calculateHalfPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }
}
