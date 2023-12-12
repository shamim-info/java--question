package sarfrazsir;

 class Vehicle {
 void speedUp() {
	 
 }
}
class car extends Vehicle{
	@Override
	void speedUp() {
		System.out.println("car runs faster");
	}
}
class cycle extends Vehicle{
	@Override
	void speedUp() {
		System.out.println("cycle runs slower than car");
	}

	 }
 

