package shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double len, double wid) {
        this.width = wid;
        this.length = len;
    }


    public double getArea() {
        double area = this.length * this.width;
        System.out.println(area + " Coming from rectangle class");
        return area;
    }

    public double getPerimeter() {
        double perimeter = (2 * this.length) + (2 * this.width);
        System.out.println(perimeter + " Coming from rectangle class");
        return perimeter;
    }
}
