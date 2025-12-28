public class Largest_Array {
    public static int largestNum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                max=arr[i];
             }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={-1, -10, -100, -26,0,1,26};
        System.out.println(largestNum(arr));
    }
}
