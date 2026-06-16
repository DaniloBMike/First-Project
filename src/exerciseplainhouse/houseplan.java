package exerciseplainhouse;

public class houseplan {

    //Attributes

    String nameOwner;
    int houseSize;
    int roomQuantity;
    int bathroomQuantity;
    String insideColor;
    String outsideColor;
    String material;
    int restroom;
    boolean backyard;
    int garageSpace;
    boolean kitchen;


    public void changeParameters (int newSize, int newRoomQuantity, int newBathroomQuantity, int newGarage) {

        houseSize = newSize;
        roomQuantity = newRoomQuantity;
        bathroomQuantity = newBathroomQuantity;
        garageSpace = newGarage;

    }

    public void changeParameters2 (int newHouseSize2, int newHouseRoomQuantity2, int newHouseBathroomQuantity2, int newHouseGarage2) {

        houseSize = newHouseSize2;
        roomQuantity = newHouseRoomQuantity2;
        bathroomQuantity = newHouseBathroomQuantity2;
        garageSpace = newHouseGarage2;

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
        System.out.println(" There are kitchen in the house? " + kitchen);


    }
    public void paintingHouse(){
        System.out.println(" The color inside of the house is : " + insideColor);
        System.out.println(" The color outside of the house is : " + outsideColor);
    }

    public void changeColor(String newColor) {

        insideColor = newColor;
        outsideColor = newColor;
        paintingHouse();
    }

    public void newHouseSize(int newSize) {

        houseSize = newSize;
        buildingHouse();

    }

    public int multiplaySize (){return houseSize * roomQuantity * bathroomQuantity;}


    public void changeColorHouse2 (String newColorHouse2) {

        outsideColor = newColorHouse2;
        insideColor = newColorHouse2;
        paintingHouse();

    }

    public int multiplyingAllParameters ( ) {
        return houseSize * roomQuantity * garageSpace * bathroomQuantity;
    }

    public String nameElements () {
        return nameOwner + " " + insideColor + " " + outsideColor + " " + material ;
    }

    }





