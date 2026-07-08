package exerciseOPP;

public class Workers {
    public static void main ( String[] args) {


         Employee workerData = new Employee();

         workerData.profession = " Developer TI ";
         workerData.name = " Danilo ";
         workerData.whereLive = " Hokkaido, Japan ";
         workerData.hybrid = false;
         workerData.homeOffice = true;
         workerData.salary = 50.000;
         workerData.hoursWorked = 30;



        Employee workerData02 = new Employee();

        workerData02.profession = " PM Product Manager ";
        workerData02.name = " Mike ";
        workerData02.whereLive = " Okinawa, Japan ";
        workerData02.hybrid = false;
        workerData02.homeOffice = true;
        workerData02.salary = 60.000;
        workerData02.hoursWorked = 35;



        workerData.bonus();

    }

}
