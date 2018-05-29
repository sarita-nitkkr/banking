package vehicle.another;

import vehicle.base.Vehicle;//bcpz it is in another package..so we have to import

public class Test {
  public static void main(String args[]) {
	  Vehicle v=new Vehicle (); //we are calling constructor
	  v.speed = 5; //variables of class if defined as a protected thn it cannot 
	  //used in the different package..it will be used only in the same package.
	 v.model= "name";
	  v.color ="color";
	  
	  v.wheelerType ="z";
	  
	  
	   int y=v.getSpeed();
	  System.out.println(y);
	  v.setSpeed(13);
	  int x = v.getSpeed();
	  System.out.println(x);
	  
	  Vehicle v1=new Vehicle ();
	  int x1 = v1.getSpeed();
	  System.out.println(x1);
	  
	  System.out.println(x);
  }
  
}
