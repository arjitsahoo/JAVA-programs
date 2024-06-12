import java.util.*;
public class SelectionSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,tmp;
        int list[]= new int[10];
        System.out.println("Enter 10 numbers: ");
        for(i=0; i<10; i++)
        {
            list[i]=sc.nextInt();
        }
        for(i=0; i<9; i++)
        {
            for(j=i+1; j<10; j++)
            if(list[i] > list[j])
            {
                tmp=list[i];
                list[i]=list[j];
                list[j]= tmp;
            }
        }
        for(i=0; i<10; i++)
        {
            System.out.print(list[i]+" ");
        }
        
    }
}
