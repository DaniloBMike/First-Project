import java.util.Scanner;

public class scanner {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your full name here: ");
        String name = scanner.nextLine();
        System.out.println("Name:" + name );

        System.out.println("Put your age here: ");
        int age = scanner.nextInt();
        System.out.println("Age:" + age);

        System.out.println("You are employed?" );
        boolean employed = scanner.nextBoolean();
        System.out.println("Employed:" + employed);

        System.out.println("Name: " + name + " age: " + age + " Employed? " + employed);


    }
}