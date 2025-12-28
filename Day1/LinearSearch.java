import java.util.*;
public class LinearSearch {
    public static int array(int arr[],int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
               return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,5,16,3,7,10};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
      System.out.println("The index value is "+array(arr,target));  
        
     }
}
