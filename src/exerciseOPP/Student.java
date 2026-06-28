package exerciseOPP;

public class Student {

    String name1, name2;
    double grade1, grade2;
    double grade3, grade4;


    public double Average(){
        return (grade1 + grade2) / 2;
    }

    public double Average2() {
        return ( grade3 + grade4) / 2;
    }

    public void Result() {
        double gradesResult = Average();
        System.out.println(" The average result of Danilo's grade is " + gradesResult);
        if (gradesResult >= 7.0) {
            System.out.println(name1 + " Approved ");
        } else {
            System.out.println(name1 + " Failed ");
        }
    }


    public void Result1() {
        double gradesResult1 = Average2();
        System.out.println( " The average result of Vanessa's grade is " + gradesResult1);
        if ( gradesResult1 >= 7.0) {
            System.out.println( name2 + " Approved ");
        } else {
            System.out.println( name2 + " Failed ");
        }
    }
}