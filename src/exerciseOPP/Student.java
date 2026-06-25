package exerciseOPP;

public class Student {

    String name;
    double grade1;
    double grade2;


    public double Average(){
        return (grade1 + grade2) / 2;
    }

    public void Result() {
        double resultAverage = Average();
        System.out.println( " The average result is " + resultAverage );
        if ( resultAverage >= 7.0) {
            System.out.println( " The student Danilo pass the exam " + resultAverage );
        }
        else {
            System.out.println(" The student Danilo do not pass the exam " + resultAverage);
        }

    }
}