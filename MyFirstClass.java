package javaBasics2016;

public class MyFirstClass {
  private
	  int x = 1;
  	  int y = 20;
 
//  private int getX() {
  protected int getX() {
	
	System.out.println("in GetX");
	return x*0;
}
  
public MyFirstClass(int x, int y) {
	super();
	System.out.println("constructor");

	this.x = x;
	this.y = y;
}
public void setX(int x) {
	System.out.println("in SetX");
	this.x = x;
	System.out.println("in SetX" + x);
}
public int getY() {
	System.out.println("in getY");
	return y;
}
public void setY(int y) {
	System.out.println("in setY");
	this.y = y;
}

public void setXY(final int x, int y) {
	System.out.println("in setXY");
    this.x = x;
	this.y = y;
	System.out.println("in SetXY" + x);
}
  

}
