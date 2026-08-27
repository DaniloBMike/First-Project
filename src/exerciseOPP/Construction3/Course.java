package exerciseOPP.Construction3;

public class Course {

    //Attributes

    String courseName;
    String studentName;
    double totalHours;
    double hoursCompleted;
    double price;
    boolean graduate;


    //Construction

    public Course(String courseName, String studentName, double totalHours, double hoursCompleted, double price, boolean graduate) {

        this.courseName = courseName;
        this.studentName = studentName;
        this.totalHours = 0;
        this.hoursCompleted = hoursCompleted;
        this.price = price;
        this.graduate = graduate;
    }

    //Methods

    public void studyHours (double hours){

        hoursCompleted = hoursCompleted + hours;
    }

    public double progress(){

        return (hoursCompleted / totalHours) * 100;
    }

    public boolean isCompleted() {

        if(progress() >= 100) {
            return true;
        }
        else {
            return false;
        }
    }

    public void showProgressBar() {

        System.out.println(" Show : " + progress());
    }
}
