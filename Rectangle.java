
public class Rectangle
{
   public double Height;
   public double Width;
   public double X;
   double Y;
   public Rectangle()
   {
	   
   }
   public Rectangle(double height,double width,double x,double y)
   {
	   Height = height;
	   Width = width;
	   X = x;
	   Y = y;
   }
   public double getHeight()
   {
	   return Height;
   }
   public double getWidth()
   {
	   return Width;
   }
   public double getX()
   {
	   return X;
   }
   public double getY()
   {
	   return Y;
   }
   public double getArea()
   {
	   return Height*Width;
   }
   public double getPerimeter()
   {
	   return (Height+Width)*2;
   }
   public String toString()
   {
	   return "java.Rectangle:"+"[ x="+X+",y="+Y+",width="+Width+",height="+Height+"]";
   }
   
}
