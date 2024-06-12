import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n,i,j,nd=0,sum=0,dig,p;
            
            System.out . println("Enter a number");
            n= sc.nextInt();

            for(i=n; i!=0; i=i/10)
            {
                nd++;
            }
            for(i=n; i!=0; i=i/10)
            {
                dig=i%10;
                p=1;
                for(j=1; j<=nd;j++)
                {
                    p=p*dig;
                }
                sum=sum+p;
            }
        if(sum==n)
            System.out.println("It is Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
        }    
    }
    
}
