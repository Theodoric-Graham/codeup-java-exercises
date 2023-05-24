package shapes;

public class Square extends Rectangle{

    protected double side;



    public Square(double side) {
        super(side, side);
        this.side = side;


    }

    public double getArea() {
        double area = side * side;
        System.out.println(area + " Coming from square override");
        return area;
    }

    public double getPerimeter() {
        double perimeter = 4 * side;
        System.out.println(perimeter + " Coming from square override");
        return perimeter;
    }



}
