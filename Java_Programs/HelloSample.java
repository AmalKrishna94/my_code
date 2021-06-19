import java.util.Scanner;

public class HelloSample{
    
    public static void main(String ar[]){

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");

        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println("The numbers are "+a+" & "+b);

        int c=a+b;
        
        System.out.println("The sum is "+c+"..!!");



    }



}