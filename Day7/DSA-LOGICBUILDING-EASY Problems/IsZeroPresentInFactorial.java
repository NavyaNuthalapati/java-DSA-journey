//4.Factorial Trailing Zeroes Given an integer n, return the number of trailing zeroes in n!.
//Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
//Example Input: n = 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.

import java.util.*;
public class IsZeroPresentInFactorial{
  public static int isZeroInFactNo(int n){
    long fact=1;
    if(n==0){
      fact=1;
      return 0;
    }
  for(int i=1;i<=n;i++){
    fact=fact*i;
  }
    while(fact>0){
      if((fact%10)==0){
        return 1;
       }
      break;
    }
     fact=fact/10;
    return 0;

  //   //second way
  //   if(n<5){
  //     return 0;
  //   }
  //   return 1;
   }
  public static void main(String args[]){
    int n=3;
    System.out.println(isZeroInFactNo(n));
  }
}
