//public class person {
//
//    String name;
//    int age;
//
//
//    public void introduce() {
//
//        System.out.println(" Hi my name is " + name + " and I am " + age + " years old");
//
//    }
//
//    public static void main (String[] args) {
//
//        person man = new person();
//
//        man.name = "Danilo";
//        man.age = 20;
//
//        man.introduce();
//
//
//    }
//
//}




public class BankAccount {

    String ownerName;
    double balance;

    public void deposit (double amount) {

        balance = balance + amount;
    }

    public void withdraw (double amount) {

        balance = balance - amount;

    }

    public void showBalance() {

        System.out.println( " Account owner : " + ownerName  + " Balance : " + balance);

    }

    public static void main(String[] args) {

        BankAccount clientDetails = new BankAccount();

        clientDetails.ownerName = "Danilo";
        clientDetails.deposit(500);
        clientDetails.withdraw(300);

        clientDetails.showBalance();

    }

}





