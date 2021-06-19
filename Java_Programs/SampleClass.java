import java.util.Scanner;

public class SampleClass {
    public static void main(String ar[]){
        SampleDemo S1 = new SampleDemo();
        SampleDemo S2 = new SampleDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number to the first obj:");
        S1.a = sc.nextInt();
        System.out.println("Enter the second number to the first obj:");
        S1.b = sc.nextInt();
        System.out.println("Enter the first number to the second obj:");
        S2.a = sc.nextInt();
        System.out.println("Enter the second number to the second obj:");
        S2.b =sc.nextInt();
        System.out.println("The first: "+S1.a);
        System.out.println("The second: "+S1.b);
        System.out.println("The third: "+S2.a);
        System.out.println("The forth: "+S2.b);
        System.out.println("Function call..!!");
        S1.display();
        S2.display();
    }
    
}

class SampleDemo{
    int a, b;
    void display(){
        System.out.println(a+" "+b);
    }
}
