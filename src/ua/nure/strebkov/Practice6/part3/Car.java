package ua.nure.strebkov.Practice6.part3;

public class Car {
	 private int id;
	    private static int count;

	    public Car() {
	        this.id = count++;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return "Car_" + id;
	    }
}
