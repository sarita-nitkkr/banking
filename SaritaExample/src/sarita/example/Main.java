package sarita.example;

import sarita.animal.example.Kite;

public class Main {

	public static void main(String[] args) { //ees project k saare parameter ab use ho rahe hain
		
        Animal a = new Animal();
        Animal c = new Cat();
        
        Animal k = new Kite();
        
        whoisEating(a);
        
        whoisEating(c);
        
        whoisEating(k);
        
        
	}

	public static void whoisEating(Animal x) {
		x.eat();
	}
}





//Animal dog=new Cat ();//now we use animal...and dog cannot be String so, Animal dog and not String Dog
//// we cannot make al,,kl copy of abstract class or instance variable.therefor we cannot write Animal d=new Animal();
//dog.setName("cat");
//String name=dog.getName();
//
//dog.setColor("Mixed White Brown");
//String color=dog.getColor();
//
//dog.setSpeed(15);
//int speed=dog.getSpeed ();
//
//boolean runFast=dog.runFast();
//
//String voice=dog.getVoice();
//
//System.out.println("Name"+"="+ name+",Color"+"="+ color +",Speed"+"="+speed +",Is RunFast ?" +"="+ runFast +",voice"+"="+voice);
//
//Elephant e=new Elephant();
//
//e.setName("Elephant");
//String nameEle=e.getName();
//
//e.setColor("Black");
//String ColorEle=e.getColor();
//
//e.setSpeed(15);
//int speedEle=e.getSpeed();
//
//boolean runFastEle=e.runFast();
//
//e.setTrunkLength(15);
//int TrunkLength=e.getTrunkLength();
//
//String Elevoice=e.getVoice();
//
//System.out.println("Name"+"="+nameEle+" Color"+"="+ColorEle+ "  Speed"+"="+speedEle+" IsRunFast"+"="+runFastEle
//		+"TrunkLength"+"="+TrunkLength+" Voice"+"="+Elevoice);
