public class Square extends Rectangle{

    //no init
    private double side;

    //constructors

    public Square(String color, boolean filled, double area, double perimeter, double width, double length, double side) {
        super(color, filled, area, perimeter, width, length);
        this.side = side;
    }


    //setters n getters no

    public double getSide() {
        return super.getPerimeter()/4;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //@override

    @Override
    public double getArea() {
        return Math.pow(super.getLength(),super.getLength());
    }

    //toString no

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
