package sarita.example;

public class Cat extends Animal{  //CONSTRUCTOR TO ALREADY HAI HI COPY PASTE KRNE K LIYE THN Y WE NEED THIS??
	
	public String getVoice() {
		return "Mew-Mew";
	}
	protected boolean niAnimal=true;
	
	public boolean isNiAnimal() {
		return this.niAnimal;
	}

	public void eat() {
		System.out.println("Cat is eating");
	}
}
