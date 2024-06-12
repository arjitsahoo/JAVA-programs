import java.util.*;
public class MatrixrowSum {

    public static void main(String args[])
    {
        int i,j,sum;
        Scanner sc = new Scanner(System.in);
        int x[][]=new int[3][4];
        System.out.println("Enter numbers in a 3*4 matrix");

        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                x[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
           sum=0;
            for(j=0;j<4;j++)
            {
                System.out.print(x[i][j]+" ");
                sum = sum+ x[i][j];
            }
            System.out.print("Sum is "+sum);
            System.out.println();
        }

    }
}
