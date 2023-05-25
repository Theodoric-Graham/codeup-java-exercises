package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * this.length) + (2 * this.width);
//        System.out.println(perimeter + " Coming from rectangle class");
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = this.length * this.width;
//        System.out.println(area + " Coming from rectangle");
        return area;
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

    }
//    protected double width;
//    protected double length;
//
//    public Rectangle(double len, double wid) {
//        this.width = wid;
//        this.length = len;
//    }
//
//
//    public double getArea() {
//        double area = this.length * this.width;
//        System.out.println(area + " Coming from rectangle");
//        return area;
//    }
//
//    public double getPerimeter() {
//        double perimeter = (2 * this.length) + (2 * this.width);
//        System.out.println(perimeter + " Coming from rectangle class");
//        return perimeter;
//    }
}
