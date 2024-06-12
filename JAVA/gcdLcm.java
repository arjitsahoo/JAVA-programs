import java.util.*;
public class gcdLcm {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,rem,gcd;
        System.out.println("Enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2 !=0)
        {
         rem=n1%n2;
         n1=n2;
         n2=rem;

        }
        gcd=n2;
        System.out.println("Gcd ="+gcd);
        int lcm= (on1*on2)/gcd;
        System.out.println("Lcm ="+lcm);
    }
}
