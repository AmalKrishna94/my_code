import java.util.Scanner;

public class TwoFunctions {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st obj nums: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the 2nd obj nums: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt(); 
        Sum obj1 = new Sum();
        Sum obj2 = new Sum();
        obj1.sum_calculator(num1,num2);
        System.out.println("The sum of first obj nums is:");
        obj1.display();
        obj2.sum_calculator(num3,num4);
        System.out.println("The sum of second obj nums is:");
        obj2.display();
    }
}

class Sum{
    int c;
    void sum_calculator(int k, int m){   
        c = k+m;
    }   
    void display(){
        System.out.println(c);
    }    
}
