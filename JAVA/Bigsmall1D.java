import java.util.*;
public class Bigsmall1D {
   
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x[]= new int[10];
        int big, sml;  
        System.out.println("Enter 10 numbers: ");
        x[0]= sc.nextInt();

        big= x[0];
        sml= x[0];
        for(int i=1; i<10; i++)
        {
            x[i]= sc.nextInt();
                if(x[i]> big)
                {
                    big= x[i];
                }
                if(x[i]<sml) 
                {
                    sml=x[i];
                }
        }
        System.out.println("The biggest number is "+big);
        System.out.println("The smallest number is "+sml);
        
    }
}
