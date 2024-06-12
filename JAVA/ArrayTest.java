import java.util.*;
import java.util.Arrays;

public class ArrayTest {
     
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void changeArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }
    }

    static int countOccurences(int arr[], int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== x)
              count++;
        }
        return count;
    }

    static int lastOccurences(int arr[], int x){
        int lastIndex= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== x)
              lastIndex=i;
        }
        return lastIndex;
    }

    static boolean isSorted(int arr[]){
        boolean check=true;
        for(int i=1; i< arr.length; i++){
            if(arr[i] < arr[i-1])
            check=false;
            break;
        }
        return check;
    }

    static int[] smallestAndLargestElements(int arr[]){
        Arrays.sort(arr);
        int ans[]= {arr[0], arr[arr.length-1]};
        return ans;
    }

    static int pairSum(int[] arr,int target){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
            if(arr[i] + arr[j]== target){
                ans++;
                }
            }
        }
        return ans;
    }

    static int tripletCount(int[] arr,int target){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k]== target){
                 ans++;
                }
                }
            
            }
        }
        return ans;
    }

    static int findUnique(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMax(int[] arr){
        int mx= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx= arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr){
        int mx=findMax(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i]==mx){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax= findMax(arr);
        return secondMax;
    }

    static int firstRepeatingNumber(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;

    }

    static int lastRepeatingNumber(int[] arr){
        int num=-1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    num=arr[i];
                }
            }
        }
        return num;
    }

    static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int[] arr){
        int min=findMin(arr);
        for(int i=0; i< arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin= findMin(arr);
        return secondMin;
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.printf("%03d",33);

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int a[]= new int[n];

        System.out.println("Enter "+n+ " elements");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
       
        
        
      /*   System.out.println("Original array");
        printArray(a);
        
       // int a2[]= a.clone();
       //int a2[]= Arrays.copyOf(a, a.length);
       //int a2[]= Arrays.copyOf(a, 2);
       int a2[]= Arrays.copyOfRange(a, 1,4);
       System.out.println("Copied array");
        printArray(a2);  
     */

    // System.out.println("Enter X");
    // int num= sc.nextInt();
     
     //System.out.println("Count of X is "+countOccurences(a, num));
     //System.out.println("Last occurence of X is "+lastOccurences(a, num));
        
    // System.out.println("Array sorting status is "+ isSorted(a));

    // int ans[]= smallestAndLargestElements(a);
    // System.out.println("Smallest element is "+ans[0]);
    // System.out.println("Largest element is "+ans[1]);
    
    //System.out.println("Enter the target");
    //int target= sc.nextInt();
      //System.out.println("Number of pairs present is: "+ pairSum(a,target));
    //System.out.println("Number of triplets present is: "+ tripletCount(a,target));

    //System.out.println("Unique element is "+ findUnique(a));

    //System.out.println("Largest element is "+ findMax(a));
    //System.out.println("Second Largest element is "+ findSecondMax(a));

    // System.out.println("First repeating number is "+ firstRepeatingNumber(a));
    //System.out.println("Last repeating number is "+ lastRepeatingNumber(a));

    System.out.println("Smallest element is "+ findMin(a));
    System.out.println("Second Smallest element is "+ findSecondMin(a));
   
    }
}
 