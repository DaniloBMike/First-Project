package exerciseOPP;

public class StudentGrades {
    public static void main ( String [] args) {

        Student studentGrades = new Student();

        studentGrades.name = " Danilo ";
        studentGrades.grade1 = 6.5;
        studentGrades.grade2 = 8.3;


        Student studentGrades1 = new Student();

        studentGrades1.name = " Vanessa ";
        studentGrades1.grade1 = 7.5;
        studentGrades1.grade2 = 5.3;

        studentGrades.result();
        studentGrades1.result();
    }

}
