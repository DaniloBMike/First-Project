//Exercise - object-oriented programming (OOP) class Bank Account

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





