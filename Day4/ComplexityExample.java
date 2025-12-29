public class ComplexityExample{
  public static int linearSearch(int arr[],int target){ // function to search the target element 
    for(int i=0;i<arr.length;i++) //traverse the whole array 
      {
        if(arr[i]==target){
          return i; //index value is returned 
        }
      }
    return -1;
  }
  public static int maxNo(int arr[]){ //function to return the Maximum(Largest) Element
    int max=Integer.MIN_VALUE; //max = -infinty
    for(int i=0;i<arr.length;i++){
      if(arr[i]<max){
        max=arr[i];
      }
    }
    return max;
  }
  public static int twoSum(int arr[] ,int target){ //Two sum array nested loops to print the indices to get the target value
    
    for(int i=0;i<arr.length;i++){
      int sum=0;
      for(int j=i;j<arr.length;j++){
        sum+=arr[j];
        if( sum==target){
          return new int[]{i,j};
        }
      }
    }
  }
  public static void main(String args[]){
    int arr[]={2,5,3,8,1,10};
    int target=8;
    System.out.println("The target is present in the "+linearSearch(arr,target)+" index"); //function calling and printing statement
    System.out.println("The largest element is "+maxNo(arr)); //function calling and printing statement
    System.out.println(twoSum(arr,target)); //function calling!!
  }
}
