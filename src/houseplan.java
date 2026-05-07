public class houseplan {


    // The plan base for the house

    int homeSize;
    int roomQuantity;
    int bathroomQuantity;
    int restRoom;
    int kitchen;
    int livingRoom;
    int garageSpace;

    // The plan style base for house

    String colorOutside;
    String colorInside;
    String colorGarage;

    public void building () {

        System.out.println("The home size of is : " + homeSize);
        System.out.println("The number of rooms is : " + roomQuantity);
        System.out.println("The number of bathrooms is : " + bathroomQuantity);
        System.out.println("The number of restroom is : " + restRoom);
        System.out.println("The number of kitchen is : " + kitchen);
        System.out.println("The number of living room is : " + livingRoom);
        System.out.println("The number of garages is : " + garageSpace);

    }

    public void colorsHouse () {

        System.out.println(" The color of the outside house is : " + colorOutside);
        System.out.println(" The color of inside house is : " + colorInside);
        System.out.println(" The color of garage is : " + colorGarage);


    }



}
