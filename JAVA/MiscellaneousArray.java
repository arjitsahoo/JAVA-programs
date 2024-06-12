import java.util.*;

public class MiscellaneousArray {

    static void printArray(int[] arr){
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

/*  static int[] reverseArray(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        int i=n-1,j=0;

        while(i>=0){
            ans[j++]=arr[i--];
        }
        return ans;
    } */

    static void swapInArray(int[] arr,int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void reverseArray(int[] arr){  // int i, int j
        int i=0, j=arr.length-1;

        while(i < j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }

    }
    static int[] rotateArray(int[] arr, int k){
        int n= arr.length;
        k= k % n;
        int[] ans= new int[n];
        int j=0;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
         for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    } 

   /* static void rotateInPlace(int arr[], int k){
        int n= arr.length;
        k= k % n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k, n-1);
        reverseArray(arr, 0, n-1);
    } */
    
    static int[] makeFrequencyArray(int[] arr){
        int[] freq= new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    static void sortZeroesAndOnes(int[] arr){
        int n= arr.length;
        int left=0, right=n-1;

        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void sortOddEven(int[] arr){
        int n= arr.length;
        int left=0; int right=n-1;
        while(left < right){
            if( arr[left]%2 != 0 && arr[right]%2 == 0 ){
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if( arr[left]%2 == 0){
                left++;
            }
            if( arr[right]%2 != 0){
                right--;
            }
        }
    }
    static int[] sortSquares(int[] arr){
        int n= arr.length;
        int left= 0, right=n-1;
        int[] ans = new int[n];
        int k=n-1;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static int[] makePrefixSum(int[] arr){
        int n=arr.length;
        int pref[] = new int[n];
        pref[0]=arr[0];
    
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    static int[] makePrefixSumArray(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static int findArraySum(int[] arr){
        int n = arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
             sum += arr[i];
        }
        return sum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefixSum=0;
        for(int i=0; i<arr.length; i++){

            prefixSum += arr[i];
            int suffixSum= totalSum-prefixSum;

            if(prefixSum== suffixSum){
                return true;
            }
        }
        return false;
    }
    static void makeSuffixSumArray(int[] arr){
        
        for(int i=arr.length-2; i>=0; i--){
            arr[i]= arr[i]+arr[i+1];
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int a[]= new int[n];

        System.out.println("Enter "+n+ " elements");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        //reverseArray(a);
        
        //System.out.println("Enter the steps of rotation");
        //int k = sc.nextInt();

        //int[] ans=  rotateArray(a,k);
        //System.out.println("Original array");
        //printArray(a);
        
       /*  System.out.println("Array after rotation");
        rotateInPlace(a, k);
        printArray(a); */

       /*  int freq[] = makeFrequencyArray(a);
        System.out.println("Enter number of queries ");
        int q= sc.nextInt();

        while( q>0 ){
            System.out.println("Enter the number to be searched");
            int x= sc.nextInt();

            if(freq[x] > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            q--;

        }  */

       // int[] pref = makePrefixSum(a);

      /*  System.out.println("Enter number queries");
        int q=sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r =sc.nextInt();

            int sum= pref[r] - pref[l-1];
            System.out.println("Sum is " + sum);
        } */

        System.out.println("Original array");
        printArray(a);
        //sortSquares(a);
       // sortOddEven(a);
       // System.out.println("Array after sorting");
      // makePrefixSumArray(a);
      //System.out.println("Possibility of partition is "+ equalSumPartition(a));
      makeSuffixSumArray(a);
       printArray(a);
    }
    
}
