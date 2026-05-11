public class person {

    String name;
    int age;


    public void introduce() {

        System.out.println(" Hi my name is " + name + " and I am " + age + " years old");

    }

    public static void main (String[] args) {

        person man = new person();

        man.name = "Danilo";
        man.age = 20;

        man.introduce();


    }

}
