package exerciseOPP;

public class Student {

    String name1, name2;
    double grade1;
    double grade2;


    public double Average(){
        return (grade1 + grade2) / 2;
    }

    public void Result() {
        double resultAverage = Average();
        System.out.println( " The average result of Danilo's grade is " + resultAverage );
        if ( resultAverage >= 7.0) {
            System.out.println( name1 + " Approved " );
        }
        else {
            System.out.println( name2 + " Failed ");
        }


    }
}