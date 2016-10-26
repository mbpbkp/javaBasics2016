package javaBasics2016;

public class MyMain {
	
	static int a = 3;
	static int b;
	static void method(int x){
		System.out.println("in method");
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static {
		System.out.println("in static method");
	//	System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		b = a * 4;
	}
	public static void main(String args[]){
		MyMain.b = 100;
		System.out.println("this is main");
		
		method(42);
		System.out.println("after method call");
		MyMain.b = 50;
		System.out.println("after B  is = " +b);
	/*	
		int a = 5;
		int b = 10;
		int c = b;
		a = a+1;
		b= b-1;
		c =c+a;
		System.out.println("A is:" + a + "\nB is:" + b + "\nC is:" + c);
*/
		/*
		MyFirstClass c1 = new MyFirstClass(10,20);
	//	c1.MyFirstClass();
		c1.setX(101);
	//	c1.x = 50;
//		System.out.println(c1.x);
		
		MyFirstClass c2 = new MyFirstClass(101,202);
		c2.setXY(100, 10);
//		c2.x = 50;
	//	System.out.println(c2.x);
	//	MyMain();
		MySecondClass c3 = new MySecondClass();
		**/
	}
	
	/*
public static void MyMain(){
	System.out.println("this is a test");
}

	*/
}