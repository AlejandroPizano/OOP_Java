public class Garage {
    void park(Vehicle i){
        if(i.getClass()!=Airplane.class) {
            System.out.println("The " + i.getMake() + " " + i.getModel() + " is parked on the garage");
        }else System.out.println("Airplane "+ i.getMake()+" "+i.getModel()+"is parked on the hangar has capacity of ");
    }
}
