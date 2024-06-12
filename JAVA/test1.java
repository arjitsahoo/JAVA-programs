

public class test1 {
     void arrMax(){
        int a[]= {1,5,3,10,3};
        int x=3;
        int ans=-1;

        for(int i=0; i<a.length; i++){
           if(a[i]== x){
            ans=i;

            break;
           }
        }   
           if(ans== -1){
            System.out.println("Not found");
           }
           else{
            System.out.println(x+" is present at index "+ ans);
           }
            
            
           
          
        }
        
    
    public static void main(String[] args) {
        test1 t= new test1();
       t.arrMax();
      
    }
}
