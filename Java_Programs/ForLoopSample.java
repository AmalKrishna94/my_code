import java.util.Scanner;

public class ForLoopSample {
    public static void main(String a[]){
        System.out.println("Enter the limit:");
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int sum =0;
        for(int i=1;i<=limit;i++){
            System.out.print(i+" ");
            sum = sum + i;
        }
        System.out.println("\nThe sum is "+sum);
    }
    
}
