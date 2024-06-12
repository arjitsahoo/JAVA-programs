import java.util.*;
 class SumEven1D {
   
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int x[]=new int[10];
            int sum=0;
            System.out.println("Enter 10 numbers: ");
                for(int i=0; i<10; i++)
                {
                    x[i]= sc.nextInt();
                    if(x[i]%2 == 0)
                    {
                       sum=sum+x[i];
                    }
                }
            
            
            System.out.println("Sum of given even numbers is : "+sum);
        }
    }
}
