public class RecursionBasic {
     public static void printDec(int n){  //recursive function that prints N to 1 in descending order
        if(n==1){  //Base Case
           System.out.print(n);
             return;
        }
         System.out.print(n+" ");
         printDec(n-1); //function call
     }
    public static void printAss(int m){   //recursive function that prints numbers from 1 to N 
        if(m==1){  //base case to end recursive function
           System.out.print(m);
            return;
        }                             // It is similar to the above Dec function but the difference is where to put print statement and when to call the function 
        printAss(m-1); //Here we wrote recursive function first because it prints from 1 to N wgere it first executes the function call and return to each function to execute the statement!!
        System.out.print(" "+m);
        
    }
    public static int fact(int n){  //Recursive function used to print factorial of given N
       
        if(n==0){ //base case 0!=1;
            return 1;
        }
        int fact= n*fact(n-1); //function call
        return fact;
        
    }
    public static int sum(int n){ //recursive function that print sum of the given number from 1 to N
         if(n==0){
            return 0;
         }

         int sum=n+sum(n-1); //function call
         return sum;

    }
    public static void main(String args[]){
           int n=3,m=5;
        //    printDec(n);
        // printAss(m);
        // System.out.print(fact(n));  
          System.out.println(sum(n));
    }
}
