import javax.swing.ScrollPaneConstants;

class Rectangle
{
    int length,breadth;
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    int area()
    {
        int a= length*breadth;
        return a;
    }
}

public class RectangleApp 
{
    public static void main(String[] args) {
    Rectangle r1= new Rectangle(5,10);
    int r= r1.area();
    System.out.println("Area of rectangle="+r);
   
}
    
}
