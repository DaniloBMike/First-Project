package exerciseOPP;

public class rectangle {

    String nameId;
    double width;
    double height;


    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * ( width + height );
    }

    public void describe () {
        System.out.println( "  The area of the" + nameId + " is " + area() + " and the perimeters result is " + perimeter() +
        " The area of the " + nameId + " is" + area() + " and the parameters is " + perimeter() );
    }

}
