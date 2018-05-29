package vehicle.base;


public class SamePackage {
	public static void main (String args[]) {
		Vehicle v=new Vehicle(); // since we have define a constructor in the vehicle
		//so we r able to instanciate..i.e. made a copy of the vehicle with name v...
		
	   
		v.setSpeed(5);
		v.setColor("white");
		v.setModel("Maruti Suzuki");
		
		
		
		
		Vehicle v1=new Vehicle(5, "white", "Maruti Suzuki") ;//constructor ki value paas karwai		
		v1.setSpeed(10);//set method ko call		
	}
}
