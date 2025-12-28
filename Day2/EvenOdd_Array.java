public class EvenOdd_Array{
    public static void evenOdd(int arr[]){
         int sumEven=0;
         int sumOdd=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumEven++;
            }else{
                sumOdd++;
            }
         }
         System.out.println("The count of even numbers in this array are: "+sumEven);
          System.out.println("The count of odd numbers in this array are: "+sumOdd);
    }    
    public static void main(String args[]){
        int arr[]={2,3,4,17,16,26,16,33,99,100};
        evenOdd(arr);
    }
}
