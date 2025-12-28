import java.util.*;
public class IfElse_Day2 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
          
        if(num>0){
            System.out.println(num+" Is a Positive Integer");
          }
        else if(num<0){
            System.out.println(num+" Is a Negative Integer");
          }
        else{
            System.out.println(num+" Is a ZERO");
            }
         
    }
    
 }
