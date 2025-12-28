import java.util.*;//package to import Scanner class
public class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //defining scanner object
        System.out.println("Enter your name and age");
        String name=sc.nextLine();  //variable name is of string type
        int age=sc.nextInt(); //variable age is of int type
        System.out.println("Hello "+name); //print statement
        if(age>=18){ //conditional statement 
            System.out.println("As your age is "+age+" so you are an adult");
        }
        else{
            System.out.println("As your age is "+age+" so you are not an adult");
        }
    }
}
