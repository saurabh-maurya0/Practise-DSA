import java.util.*;
public class Demo {
    public static int fact(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;

        }
        return f; // factorial of n
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
       System.out.println("Factorial of "+num+" is : "+ fact(num));

    }
}
