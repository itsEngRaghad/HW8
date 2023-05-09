public class Rectangle extends Shape{

    //initalization
    private double width=1.0, length=1.0;

    //constructors

    public Rectangle(String color, boolean filled, double area, double perimeter, double width, double length) {
        super(color, filled, area, perimeter);
        this.width = width;
        this.length = length;
    }


    //setter n getters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //@override

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
//remove()
    //toString

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
