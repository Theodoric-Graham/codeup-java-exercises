package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        System.out.println(length);
        return length;
    }

    public double getWidth() {
        System.out.println(width);
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
