public class Max_CountEven{
  // here we two functions are used to return maximum number in a given array and the no of even numbers present in the given array
//function to print maximum number
public static int maxNumber(int arr[]){
  int max=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
      max=arr[i];
    }
  }
  return max;
}
  //function to count the even numbers in an array
  public static int evenCount(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        count++;
      }
    }
    return count;
  }
  public static void main(String args[]){ //main function
    int arr[]={2,-1,3,26,10,20};
    System.out.println(maxNumber(arr));
    System.out.println("Even numbers  in an array are "+evenCount(arr));

  }
}
