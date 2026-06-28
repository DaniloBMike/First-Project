package exerciseOPP;

public class Student {

    String name;
    double grade1, grade2;


    public double average() {
        return (grade1 + grade2) / 2;
    }

    public void result() {
        double gradesResult = average();
        System.out.println(" The average result of " + name + " grade is " + gradesResult);
        if (gradesResult >= 7.0) {
            System.out.println(name + " Approved ");
        } else {
            System.out.println(name + " Failed ");
        }
    }
}