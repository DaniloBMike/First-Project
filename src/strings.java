public class strings {
    public static void main (String[] args) {

        String name = "Danilo";
        int numbersOfCaracters = name.length();
        String subName = " Bernardo Alves";
        boolean same = name.equals(subName);
        String nameComplete = name.concat(subName);
        String otherName = "Enzo";


         System.out.println("Your name have = " + numbersOfCaracters + " Caracters");
         System.out.println("Your name = " + name + subName);
         System.out.println("Your Subname = " + subName);
         System.out.println("They are equals = " + same);
         System.out.println("Complete Name = " +nameComplete);
         System.out.println("My little boy = " + otherName);



    }
}