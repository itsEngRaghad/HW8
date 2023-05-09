public class Shape {

    //intlization
    private String color;
    private boolean filled;
    private double area,perimeter;

    //constructors

    public Shape(String color, boolean filled, double area, double perimeter) {
        this.color = color;
        this.filled = filled;
        this.area = area;
        this.perimeter = perimeter;
    }


    //Setter & Getter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    //toString


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
