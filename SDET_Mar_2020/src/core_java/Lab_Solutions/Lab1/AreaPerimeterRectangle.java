package core_java.Lab_Solutions.Lab1;

import java.util.Scanner;

//import java.util.*; // import packages

public class AreaPerimeterRectangle {
	
	int m, n;
	
	public AreaPerimeterRectangle() //constructor //initializing the state of the object
	{
		
	}
	
	public AreaPerimeterRectangle(int a, int b) //constructor //initializing the state of the object
	{
		m =a;
		n= b;
	}
	
	public AreaPerimeterRectangle(int a, int b, int c) //constructor //initializing the state of the object
	{
		m =a;
		n= b;
	}
	

	public static void main(String[] args) 
	{
		//Ctrl + Shift + o;
		Scanner scanner = new Scanner(System.in); // ClassName objectName = new ClassName(); A a = new A(4,5);
		
		
        int l,b,area,perimeter;
      System.out.println("Enter the length of the rectangle: ");
         l = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
         b = scanner.nextInt();
         
         scanner.close();
         
         AreaPerimeterRectangle area1 = new AreaPerimeterRectangle(); //m,n
        AreaPerimeterRectangle area2 = new AreaPerimeterRectangle(); //m,n
        
        System.out.println("The first area is: " + area1.calArea(7,6));
        
        System.out.println("The second area is: " + area2.calArea(9,2));
        
         
		 area = l*b;
		 perimeter = 2*(l+b);
		 
		 System.out.println("The area of the rectangle is: " + area);
		 System.out.println("The perimeter of the rectangle is: " + perimeter);
	}
	
	public int calArea(int l, int b)
	{
		return l*b;
	}
}
