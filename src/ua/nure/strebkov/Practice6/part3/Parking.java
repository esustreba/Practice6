package ua.nure.strebkov.Practice6.part3;

public class Parking {
    private int maxPlace = 10;
    private int totalCar = 0;

    private Car[] parkingPlace = new Car[maxPlace];

    public void park(Car car){
        if(totalCar == maxPlace){
            System.out.println("No free place");
            return;
        }
        for(int i = 0; i < parkingPlace.length; i++){
            if(parkingPlace[i] == null){
                parkingPlace[i] = car;
                totalCar++;
                System.out.println("Car " + car.getId() + " parked on place " + i);
                break;
            }
        }
    }

    public void leave(int place){
        if(parkingPlace[place] == null){
            System.out.println("Parking place is free");
            return;
        }
        Car car = parkingPlace[place];
        parkingPlace[place] = null;
        totalCar--;
        System.out.println("Car " + car.getId() + " is leaved.");
    }

    public void info(){
        for(int i = 0; i < parkingPlace.length; i++){
            System.out.print("[ "+parkingPlace[i] + " ] ");
        }
        System.out.println();
        System.out.println("Total place: " + maxPlace);
        System.out.println("Free place: " + (maxPlace - totalCar));
    }
}