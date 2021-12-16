public class Vehicle {
    static int vehiclesMaked;
    private String make ;
    private String model;
    private String color;
    private int year ;
    private double price ;

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear(){
        return year;
    }
    public double getPrice() {
        return price;
    }


    Vehicle(String make, String model, String color, int year, double price){
        this.make = formatter(make);
        this.model = formatter(model);
        this.color = formatter(color);
        this.year = year;
        this.price = price;
        vehiclesMaked++;
    }
    Vehicle(Vehicle i){
        this.copy(i);
    }

    Vehicle(){
        this.make = "Volker";
        this.model = "Jetta";
        this.color = "White";
        this.year = 1998;
        this.price = 200.15;
        vehiclesMaked++;
    }
    void drive(){
        System.out.println("You´re driving the car: "+ make+" "+model);
    }


    String formatter(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() ;
    }

    void stop(){
        System.out.println("You´re stopping the car: "+make+" "+model);
    }
    public void copy(Vehicle i){
        this.setColor(i.getColor());
        this.setMake(i.getMake());
        this.setModel(i.getModel());
        this.setPrice(i.getPrice());
        this.setYear(i.getYear());
    }

}