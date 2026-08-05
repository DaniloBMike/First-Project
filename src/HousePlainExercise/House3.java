package HousePlainExercise;

public class House3 implements HouseBuilding {
    public static void main ( String [] args ) {

        houseplan House3 = new houseplan();

        House3.houseSize = 300;
        House3.roomQuantity = 3;
        House3.insideColor = "Red";
        House3.outsideColor = "black";
        House3.paintingHouse();


    }


    @Override
    public void buildingHouse() {

    }

    @Override
    public void roomQuantity() {

    }

    @Override
    public int costCalculator(int multiplaySize) {
        return 0;
    }

    @Override
    public void paintingHouse() {
    }
}
