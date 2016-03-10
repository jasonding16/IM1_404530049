import java.util.*;

public class RectangleTester 
{

	public static void main(String[] args) 
	{
		
		Scanner console = new Scanner(System.in);
		double height;
		double width;
		double x;
		double y;
		try
		{
			System.out.println("Height:");
			height = console.nextInt();
			System.out.println("Width:");
			width = console.nextInt();
			System.out.println("X:");
			x = console.nextInt();
			System.out.println("Y:");
			y = console.nextInt();
			Rectangle rec1 = new Rectangle(height, width,x,y);
			
			System.out.println(rec1.toString());
	        System.out.println("Area:"+rec1.getArea());
	        System.out.println("Perimeter:"+rec1.getPerimeter());
	                
	        System.out.println("\nHeight:");
			height = console.nextInt();
			System.out.println("Width:");
			width = console.nextInt();
			System.out.println("X:");
			x = console.nextInt();
			System.out.println("Y:");
			y = console.nextInt();
			Rectangle rec2 = new Rectangle(height, width,x,y);
			
			System.out.println(rec2.toString());
	        System.out.println("Area:"+rec2.getArea());
	        System.out.println("Perimeter:"+rec2.getPerimeter());
		}
		catch(Exception e)
		{
			System.out.println("error!");
		}
	}

}
