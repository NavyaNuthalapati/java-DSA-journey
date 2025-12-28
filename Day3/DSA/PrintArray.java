public class PrintArray{
  public static void printingArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]){
    int arr[]={2,21,3,6,8,4};
    printingArray(arr);
  }
}
