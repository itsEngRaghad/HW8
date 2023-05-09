public class Circle extends Shape{

    //initlization
    private double rad=1.0, pi=3.14;

    //constructors

    public Circle(String color, boolean filled, double area, double perimeter, double rad, double pi) {
        super(color, filled, area, perimeter);
        this.rad = rad;
        this.pi = pi;
    }


    //Setter n Getter

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    //@override

    @Override
    public double getArea() {
        return pi*(Math.pow(rad,rad));
    }

    @Override
    public double getPerimeter() {
        return 2*pi*rad;

    }

    //toString

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                ", pi=" + pi +
                '}';
    }
}
