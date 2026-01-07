//3.Given number is Palindrome?
//if same return true else false!!
public class Palindrome{
  public static boolean isPalindrome(int n){
      if(n==0){
      return true;
    }else if(n<0){
        return false;
    }
    int m=n;
    int palindrome=0;
  
    while(m>0){
      palindrome=(palindrome*10)+m%10;
      m=m/10;
    }
    if(palindrome==n){
      return true;
    }
    return false;
  }
  public static void main(String args[]){
    int n=121;
    System.out.println(isPalindrome(n));
  }
}

