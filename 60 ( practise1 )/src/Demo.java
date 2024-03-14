// Write a java method to compute the average of three numbers.
import java.util.*;
public class Demo {
    public static int avg(int a, int b, int c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Avg is : "+avg(a,b,c));
    }
}
