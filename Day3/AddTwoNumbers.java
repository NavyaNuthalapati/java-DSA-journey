public class AddTwoNumbers {
    public static int addition(int a, int b){ //function that returns addition of two numbers
        int sum=a+b;
        return sum;
    }
    public static void MaxOfThree(int a , int b, int c){  //function that prints the max of three numbers
        if((a>b)&&(a>c)){
            System.out.println("A is greater "+a);
        }else if((b>a)&&(b>c)){
            System.out.println("B is Greater "+b);
        }else{
            System.out.println("C is greater "+c);
        }
    }
    public static void EvenOddCheck(int n){ //function that checks and prints the number is even or odd
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        int a=5,b=10,c=26;
        System.out.println(addition(a, b));
        MaxOfThree(a, b, c);
        EvenOddCheck(5); //n=5
    }
}
