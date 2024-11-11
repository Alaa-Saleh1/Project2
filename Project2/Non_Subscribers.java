package Project2;

public class Non_Subscribers extends Passenger{
    private boolean discount_coupon;
    final static double discount = 0.1;

    public Non_Subscribers(String name, String ID, boolean discount_coupon) {
        super(name, ID);
        this.discount_coupon=discount_coupon;
    }

    @Override
    public void reserveTripCost(Car car) throws Exception {
        if(car.max_capacity<=0){
            throw new Exception("Car is at maximum capacity.");
        }
        this.car=car;
        car.max_capacity--;
        if (discount_coupon){
            trip_price = car.route.price - (car.route.price * discount);
        }else {
            trip_price = car.route.price;
        }

    }


    @Override
    public void displayInfo() {
        System.out.println("#Information of Non-Subscribers passengers ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+ID);
        System.out.println("Car code : "+car.code);
        System.out.println((discount_coupon ? "Route Price with 10% discount from discount coupon : ":"Route Price : ")+trip_price);
        System.out.println();

    }
}
