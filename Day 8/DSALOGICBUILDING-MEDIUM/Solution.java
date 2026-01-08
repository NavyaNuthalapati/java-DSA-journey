// 1.Amstrong number problem
class Solution {
   public static boolean armstrongNumber(int n) {
        // code here
        int m=n;
        int count = String.valueOf(n).length();
        int Amstrong=0;
        while(n>0){
            int lastDigit=n%10;
            double mulPow= Math.pow(lastDigit,count);
            Amstrong+=mulPow;
            n=n/10;
        }
        if(Amstrong==m){
            return true;
        }
        return false;
    }
    public static void main (String args[]){
        int n=153;
        System.out.print(armstrongNumber(n));
    }
}

//2.Palindrome Number Problem
class Solution {
    public static boolean isPalindrome(int n) {
        // code here
        int m=n;
        int palindrome=0;
        if(n<0){
            return false;
        }
        while(n>0){
            int lastDigit=n%10;
            palindrome=(palindrome*10)+lastDigit;
            n=n/10;
        }
        if(palindrome==m){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int n=555;
        System.out.println(isPalindrome(n));
    }
}

//3. Compute nPr Problem
class Solution {
   public static long nPr(long n, long r) {
        // code here
        long factOne=1;
        long factTwo=1;
        for(long i=1;i<=n;i++){
            factOne=factOne*i;
        }
        for(long j=1;j<=n-r;j++){
            factTwo=factTwo*j;
        }
      
        return  factOne/factTwo;
    }
    public static void main(String args[]){
        long n=5,r=2;
        System.out.println(nPr(n,r));
    }
}
