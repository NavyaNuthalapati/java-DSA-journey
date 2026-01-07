 //1.Factorial of a given number sum
class Factorial {   
    // Function to calculate factorial of a number.
   public static int factorial(int n) {
        // code here
        if(n==0){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(factorial(n));
    }
}
