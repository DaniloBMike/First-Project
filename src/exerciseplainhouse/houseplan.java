package exerciseplainhouse;

public class houseplan {

    //Attributes

    int houseSize;
    int roomQuantity;
    int bathroomQuantity;
    String insideColor;
    String outsideColor;
    String material;
    int restroom;
    int backyard;
    int garageSpace;
    boolean kitchen;


    public void changeParameters (int newSize, int newroomQuantity, int newBathRoomQuantity, int newgarage) {

        houseSize = newSize;
        roomQuantity = newroomQuantity;
        bathroomQuantity = newroomQuantity;
        garageSpace = newgarage;

    }

    //Method

    public void buildingHouse(){

        System.out.println(" The total size of the exerciseplainhouse.house is : " + houseSize);
        System.out.println(" The room quantity is : " + roomQuantity);
        System.out.println(" The bathroom quantity is : " + bathroomQuantity);
        System.out.println(" The material used is : " + material);
        System.out.println(" The quantity of restroom is : " + restroom);
        System.out.println(" The quantity of backyard is : " + backyard);
        System.out.println(" How many spaces there are at the garage? " + garageSpace);
        System.out.println(" There are kitchen in the house9? " + kitchen);


    }
    public void paintingHouse(){
        System.out.println(" The color inside of the house is : " + insideColor);
        System.out.println(" The color outside of the house is : " + outsideColor);
    }

    public void changeColor(String newColor) {

        insideColor = newColor;
    }

    public void newHouseSize(int newSize) {

        houseSize = newSize;
        buildingHouse();

    }

    public int multiplaySize (){
        return houseSize * roomQuantity * bathroomQuantity;
    }


}





