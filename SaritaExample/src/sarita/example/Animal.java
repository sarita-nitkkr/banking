package sarita.example;//yahan cheejen define ho rahe hain...so it is a factory

public abstract class Animal implements Living , Run { //interface is a class level ..it works as extend..
	//living and run are parent of Animal..and everything of living and run will be a part of Animal
		
	private String name;
	protected String color;
	protected int speed;
	
	public Animal () { //constructor 
		
	}
	public Animal (String n, String c, int x) {
	this.name=n;
	this.color=c;
	this.speed=x;
	}
		
    public String getName() {
    	return name;
    }
    public void setName (String name) {
    	this.name = name;
    }
    public String getColor () {
    	return color;
    }
    public void setColor (String color) {
    	this.color=color;
    }
    public int getSpeed () {
    	return speed;
    }
    public void setSpeed (int speed) {
    	this.speed=speed;
    }
	
    public boolean runFast() { //overriding..now watever there is in run..
    	// it will automatically comes into Animal..as animal behaves as a child of run
    	//but runFast ends in curly braces...and class k andar agar hum kuchh define kr rahe hain..to oosmai body
    	//honi chahiye...now if return true is not there ..thn also no probem..but this method is not void....so
    	// there shud be return..
    	return true;
    }
    
    //public abstract String getVoice (); //abstract method which do not have body
 
//         or
   // public String getVoice() {
   //     	 return "";
   //      }
    //since this is an abstract class..so there shud be an abstract method...
    //now interface already have abstract method
    
     void eat() {
    	System.out.println("Animal eats");
    }
}










