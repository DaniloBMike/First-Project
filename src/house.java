public class house {
    public static void main (String[] args) {

        houseplan house = new houseplan();

        house.homeSize = 95;
        house.roomQuantity = 3;
        house.bathroomQuantity = 2;
        house.restRoom = 1;
        house.kitchen = 1;
        house.garageSpace = 2;
        house.livingRoom = 1;
        house.colorOutside = "light blue";
        house.colorInside = "white and brow";
        house.colorGarage = "light green";


        house.building();

        house.colorsHouse();


    }

}
