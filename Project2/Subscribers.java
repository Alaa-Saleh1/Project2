package Project2;

public class Subscribers extends Passenger{
    final static double discount = 0.50;
    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserveTripCost(Car car) throws Exception {
        if(car.max_capacity<=0){
            throw new Exception("Car is at maximum capacity.");
        }
        this.car=car;
        car.max_capacity--;
        trip_price= car.route.price * discount;

    }

    @Override
    public void displayInfo() {
        System.out.println("#Information of Subscribers passengers ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+ID);
        System.out.println("Car code : "+car.code);
        System.out.println("Route Price : "+car.route.price);
        System.out.println("Route Price with 50% discount : " + trip_price);
        System.out.println();



    }
}
