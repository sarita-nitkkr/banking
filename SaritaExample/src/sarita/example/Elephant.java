package sarita.example;

public class Elephant extends Animal{ //Elephant IS-A Animal
	
	private int trunkLength;
	
	public int getTrunkLength() {
		return trunkLength;
	}
	public void setTrunkLength(int x) {
		this.trunkLength=x;
	}
//	public static void main (String args[]) {
//		Animal e=new Animal ();
//		String name=setName("elephant");
//		String color=setColor("Black");
//		int speed=setSpeed(4);
//	}
	public int getTrunkLength(int x) {
		return trunkLength;
	}
	
	public String getVoice() {
		return "Elephant Sound"; // it will return Elephant Sound...and not null as Elephant Sound is nearest
	}

}
