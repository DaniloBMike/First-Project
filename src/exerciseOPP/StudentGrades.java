package exerciseOPP;

public class StudentGrades {
    public static void main ( String [] args) {

        Student studentGrades = new Student();

        studentGrades.name = " Danilo ";
        studentGrades.grade1 = 6.5;
        studentGrades.grade2 = 8.3;

        Student studentGrades2 = new Student();

        studentGrades2.name = " Vanessa ";
        studentGrades2.grade1 = 7.5;
        studentGrades2.grade2 = 5.3;

        studentGrades.result();
    }

}
