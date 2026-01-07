//2.Valid Triangle check whether the give numbers can form a triangle
class TriangleSol {
    public static boolean checkValidity(int a, int b, int c) {
        // code here
        int sum1=a+b;
        int sum2=b+c;
        int sum3=c+a;
        if((sum1>c)&&(sum2>a)&&(sum3>b)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int a=8,b=15,c=17;
        System.out.println(checkValidity(a,b,c));
    }
}

