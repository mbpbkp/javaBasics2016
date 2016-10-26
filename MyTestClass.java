package javaBasics2016;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MyTestClass {
  public static void main(String args[]){
	  System.out.println("hello World");
	  int a = 10;
	  System.out.println(a);
	  {
		  a = 20;
		  System.out.println(a);
	  }
	  int m[][] = new int [2][2];
	  m[0][0] = 0;
	  m[1][1] = 1;
	  m[0][1] = 5;
	  m[1][0] = 6;
	  System.out.println(m[0][1]);
	  System.out.println("test");
	  for (int i=0; i< 2;i++)
	  {
		  for (int j=0; j< 2;j++)
		  {
			  System.out.print(m[i][j]);
		      System.out.print("\t");
		  }
		  System.out.print("\n");
		  
	  }
	  
	  
  }
}
