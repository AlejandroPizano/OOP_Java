public class Airplane extends Vehicle{
    String capacity;
    void fly(){
        System.out.println("This vehicle is flying");
    }

    public Airplane(String make, String model, String color, int year, double price, String capacity) {
        super(make, model, color, year, price);
        this.capacity = capacity;

    }

    public String toString(){
        return super.toString() + "the capacity "+ capacity;
    }
}
