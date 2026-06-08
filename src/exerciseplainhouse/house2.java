package exerciseplainhouse;

public class house2 {
    public static void main (String[] args){



        //new object created called House2.

        houseplan house2 = new houseplan();

        house2.kitchen = true;
        house2.houseSize = 80;
        house2.bathroomQuantity = 2;
        house2.roomQuantity = 3;
        house2.garageSpace = 2;
        house2.backyard = true;
        house2.material = "block and tijolo";
        house2.restroom = 1;

        //Attributes for colors

        house2.insideColor = "white and sea blue";
        house2.outsideColor = "sea blue";


        house2.buildingHouse();

        house2.paintingHouse();

        house2.newColorHouse2 ("light orange");


    }
}


