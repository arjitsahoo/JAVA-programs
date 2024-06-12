import java.util.*;
public class Big2ndApp {
    
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int x[]= new int[10];
    int i,b1,b2;
    System.out.println("Enter 10 numbers: ");
     for (i=0; i<10; i++)
      {
        x[i]=sc.nextInt();
      }    
    b1=x[0];
    b2=x[0];
    for(i=1; i<10; i++)
    {
      if(x[i]>b1)
      {
        b2=b1;
        b1=x[i];
      }  
     else if(x[i]<b1 && x[i]>b2)
      {
        b2=x[i];
      }    
    }
    System.out.println("2nd largest number is "+b2);
    }
}