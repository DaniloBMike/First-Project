package exerciseOPP;

public class Employee {

    String profession;
    String name;
    String whereLive;
    boolean hybrid;
    boolean homeOffice;
    double salary;
    int hoursWorked;


    public double bonus () {
        if ( hoursWorked > 40 ) {
            return salary * 0.20;
        }
        else {
            return 0;
        }
    }

    public double totalPayment () {
        return salary + bonus();
    }

    public void paysLip () {
        System.out.println( " The worker name is : " + name + " Salary : " + salary + " bonus : " + bonus() + " And the total payment : " + totalPayment());
    }

    public void workSchedule ( int days ) {

        for( int i = 1; i <= days; i++ ) {

            System.out.println( " The worker is : " + name + " Day " + i + " : 8 hours worked " );
        }


    }

}
