
public class Main {
    public static void main(String[] args) {

        //for Circle
        Circle c1=new Circle("Red",true,2.0,2.0,1.0,3.14);
        System.out.println("perimeter for circle is: "+c1.getPerimeter()+" Area for circle is: "+c1.getArea());

        //for Rectangle
        Rectangle r1=new Rectangle("Blue",true,4.0,6.0,3.0,5.0);
        System.out.println("perimeter for Rectangle is: "+r1.getPerimeter()+" Area for Rectangle is: "+r1.getArea());

        //For Square

        Square s1=new Square("Yellowb",true,4.0,0.0,3.0,4.0,0.0);
        System.out.println("Side for Square is: "+s1.getSide()+" Area for Square is: "+s1.getArea());
    }
}