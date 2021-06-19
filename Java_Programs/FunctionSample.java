import java.util.Scanner;

public class FunctionSample {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int sum_return = sum(num1,num2);
        System.out.println("The sum is: "+sum_return);  
    }

    static int sum(int val1, int val2){
        int sum = val1 + val2;
        return sum;
    }   
}
