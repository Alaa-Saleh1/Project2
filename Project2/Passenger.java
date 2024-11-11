package Project2;

public abstract class Passenger {

    String name;
    String ID;
    Car car;
    double trip_price;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    public abstract void reserveTripCost(Car car) throws Exception;
    public abstract void displayInfo();



}
