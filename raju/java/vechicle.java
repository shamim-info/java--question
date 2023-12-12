package raju.java;

public class vechicle {
 int numberOfWheel;
 int speed;
 String typeOfFuel;
 
  void printVehicleInfo() {
	  System.out.println("enter vhicle info");
  }
 
}
class Cars extends vechicle{
	 void printVehicleInfo() {
		 int numberOfWheel=4;
		 int speed=120;
		 String typeOfFuel="petrol/disel";
		 System.out.println(numberOfWheel + speed + typeOfFuel );
	 }
}
class motorcycle extends vechicle{
	 void printVehicleInfo() 
	 {
		 int sittingCapacity = 2;
		 int speed =80;
		 String fuelType = "petrol";
		 System.out.println(sittingCapacity + speed + fuelType );
		 
		 
		
	 }

	}







