package exerciseOPP.Construction3;

public class Course {

    //Attributes

    String courseName;
    String student;
    double totalHours;
    double hoursCompleted;
    double price;
    boolean graduate;


    public Course(String courseName, String student, double totalHours, double hoursCompleted, double price, boolean graduate) {

        this.courseName = courseName;
        this.student = student;
        this.totalHours = 0;
        this.hoursCompleted = hoursCompleted;
        this.price = price;
        this.graduate = graduate;


    }
}
