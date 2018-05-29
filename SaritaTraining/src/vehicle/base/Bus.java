package vehicle.base;

public class Bus extends Vehicle{
	
	private int price;//this variable is private as it has to be used by same class..

	public int getPrice() {
		return price;
	}

	public void setPrice(int x) {
		price = x; //eesko confusion nhi hai..thats y it isn't essential to 
		//this.price=x;
	}
	public void setPrice1(int price) {
		this.price = price; //eesko confusion h ki kaun sa price thats y we definr this.price
	}
	

}
