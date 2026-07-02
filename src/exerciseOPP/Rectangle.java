package exerciseOPP;

public class Rectangle {

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
        System.out.println( " The area of the" + nameId + " is " + area() );
        System.out.println( " The perimeter of the " + nameId + " is " + perimeter() );
    }
    
}

