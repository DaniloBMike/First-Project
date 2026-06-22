package exerciseOPP;

public class Student {

    String name;
    double grade1;
    double grade2;


    public double Average(){
        return (grade1 + grade2) / 2;
        System.out.println(" the result is : " + Average);
    }


}