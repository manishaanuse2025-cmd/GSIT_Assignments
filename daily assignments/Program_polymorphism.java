package assignments;

public class Program_polymorphism {
	static double calculateArea(int radius)
	{
		return 3.14 *radius*radius;
	}
	
	static double calculateArea(int length,int breadth)
	{
		return length*breadth;
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Area of Circle :" + calculateArea(5));
		System.out.println("Area of Rectangle :" + calculateArea(8,4));

	}

}
