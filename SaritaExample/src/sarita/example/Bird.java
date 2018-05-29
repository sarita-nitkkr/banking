package sarita.example;

public class Bird {
  protected  String name;
  protected  String color;
  protected  int speed;
  
  public Bird () {
	  
  }
  
  public Bird (String name, String color, int speed) {
	  this.name=name;
	  this.color=color;
	  this.speed=speed;   
}
  public String getName() {
	  return this.name;
  }
  public String getColor() {
	  return this.color;
	  
  }
  public int getSpeed() {
	  return this.speed;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public void setColor (String color) {
	  this.color=color;
  }
  public void setSpeed(int speed) {
	  this.speed=speed;
  }
}
