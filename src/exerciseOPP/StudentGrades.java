package exerciseOPP;

public class StudentGrades {
    public static void main ( String [] args) {

        Student studentGrades = new Student();

        studentGrades.name1 = " Danilo ";
        studentGrades.grade1 = 6.5;
        studentGrades.grade2 = 8.3;


        Student studentGrades2 = new Student();

        studentGrades2.name2 = " Vanessa ";
        studentGrades2.grade3 = 7.5;
        studentGrades2.grade4 = 5.3;

        studentGrades.Result();
        studentGrades2.Result1();
    }


}
