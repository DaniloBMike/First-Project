package exerciseOPP.Construction;

public class Employee {

        //Employee 01

        String name;
        int age;
        double salary;
        int hoursDayWorked;
        double hourWeekWorked;

        public Employee (String name, int age, int salary, int hoursDayWorked, double hourWeekWorked) {

            this.name = name;
            this.age = age;
            this.salary = salary;
            this.hoursDayWorked = hoursDayWorked;
            this.hourWeekWorked = hourWeekWorked;

            //methods

        }

            public double monthlyHourWorked() {

            return (hoursDayWorked * hourWeekWorked);
            
            }

}
