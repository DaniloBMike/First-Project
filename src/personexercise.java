public class personexercise {

    String name;
    int age;


    public void introduce() {

        System.out.println(" Hi my name is " + name + " and I am " + age + " years old");

    }

    public static void main (String[] args) {

        personexercise man = new personexercise();

        man.name = "Danilo";
        man.age = 20;

        man.introduce();


    }

}
