public class Main {
    public static void main(String[] args) {
        System.out.println(Vehicle.vehiclesMaked);
        Vehicle car = new Vehicle();
        Vehicle car2 = new Vehicle("Tesla","A3","Orange",2021,200000);
        Garage gar = new Garage();
        car.copy(car2);
        gar.park(car);
        gar.park(car2);
        Airplane plane =new Airplane("Jet","f2000","silver",2010,2000000, "super speed");
        System.out.println(plane);
        gar.park(plane);
        System.out.println(Vehicle.vehiclesMaked);

    }
}
