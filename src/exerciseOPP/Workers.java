package exerciseOPP;

public class Workers {
    public static void main ( String[] args) {


         Employee workerData01 = new Employee();

         workerData01.profession = " Developer TI ";
         workerData01.name = " Danilo ";
         workerData01.whereLive = " Hokkaido, Japan ";
         workerData01.hybrid = false;
         workerData01.homeOffice = true;
         workerData01.salary = 50000.0;
         workerData01.hoursWorked = 30;



        Employee workerData02 = new Employee();

        workerData02.profession = " PM Product Manager ";
        workerData02.name = " Mike ";
        workerData02.whereLive = " Okinawa, Japan ";
        workerData02.hybrid = false;
        workerData02.homeOffice = true;
        workerData02.salary = 60000.0;
        workerData02.hoursWorked = 35;


        workerData01.workSchedule(5);
        workerData01.paysLip();
        workerData02.paysLip();
        workerData02.workSchedule(5);


    }

}
