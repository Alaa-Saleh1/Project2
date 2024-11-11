package Project2;

public class Main {
    public static void main(String[] args) throws Exception {
        try {


            Route route1 = new Route("Riyadh", "Dammam", 60);
            Route route2 = new Route("Jeddah", "Makkah", 45);

            Car car1 = new Car("123-asd", route1, 4);
            Car car2 = new Car("456-hjk", route2, 0);

            Passenger[] passengers = new Passenger[2];
            passengers[0] = new Subscribers("Alaa", "123");
            passengers[1] = new Non_Subscribers("Sara", "456", true);



            System.out.println("--------Car Pooling System--------");

            passengers[0].reserveTripCost(car1);
            passengers[0].displayInfo();

            passengers[1].reserveTripCost(car2);
            passengers[1].displayInfo();

        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }




    }
}