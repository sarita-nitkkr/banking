package vehicle.base;
public class Vehicle {
	protected  int speed;
	protected String model;
	protected String color;
	protected String wheelerType;
	
	public Vehicle() { //construstor as no return type This type of constructor is used wen we dnt know abt initial value
		
	}
	
	public Vehicle(int x, String y, String z) {//construstor as no return type we r defining constructor
		this.speed=x;
		this.model=y;
		this.color=z;
	}
	// java apne aap se constructor banati hai...i.e. defaut constructor...so it is not required to define a constructor
	// but if we r defining a constructor in which we r passing the parameter..thn it is essential to define a 
	// default constructor

	public int getSpeed() {
		return this.speed; //agar speed eesi class mai define hai to...so we use this.speed
		// but agar speed doosre class mai define hai to v.speed....
		
	}

	public void setSpeed(int x) {
	    speed = x;//yahan hum this.speed=x bhi likh sakte hain aur speed =x bhi likh sakte hain
	}
	public void setSpeed1(int speed) {
	    this.speed = speed;//yahan hum this.speed =speed hi likhenge...bcoz this.speed will indicates class level 
	    //variable and speed will indicate the parameter that is passed...now how to differentiate between 
	    //calss level variable wala speed and the parameter that have passed by object wala speed...
	}

	public String getModel() { //method
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWheelerType() {
		return wheelerType;
	}

	public void setWheelerType(String wheelerType) {
		this.wheelerType = wheelerType;
	}

}
