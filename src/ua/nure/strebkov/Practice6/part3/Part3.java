package ua.nure.strebkov.Practice6.part3;

public class Part3 {
	public static void main(String[] args) {
        Parking parking = new Parking();
        parking.info();
        System.out.println("==================");
        for(int i = 0; i < 7; i++){
            parking.park(new Car());
        }
        parking.info();
        System.out.println("==================");
        parking.leave(2);
        parking.info();
        
        System.out.println("==================");
        parking.leave(4);
        parking.info();
        
        parking.park(new Car());
        parking.info();

    }
}
	