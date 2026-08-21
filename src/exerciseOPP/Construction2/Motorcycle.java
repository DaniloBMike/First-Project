package exerciseOPP.Construction2;

public class Motorcycle {

    String model;
    int year;
    double mileage;

    public Motorcycle(String model, int year, double mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public boolean needsRevision() {
        if(mileage >= 3000) {
            return true;
        }
        else {
            return false;
        }
    }

    public int age() {
        return year;
    }

    public void showStatus() {
        System.out.println( "Model:  " + model  + "Year: " + year + "Mileage: " + mileage);
    }

}