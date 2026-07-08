package exerciseOPP;

public class Employee {

    String profession;
    String name;
    String whereLive;
    boolean hybrid;
    boolean homeOffice;
    double salary;
    int hoursWorked;


    public double bonusWorked () {
        return hoursWorked * 0.20;
    }

    public void bonus () {

        if ( hoursWorked > 40) {
            System.out.println( " Your bonus is : " + bonusWorked() );
        } else {
            System.out.println( " Your bonus is : " + bonusWorked( ) );
        }


    }

}
