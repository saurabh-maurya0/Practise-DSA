//Write a Java method to compute the sum of the digits in an integer
import java.util.*;
public class Demo {
    public static int sum(int num) {
        int sum = 0;
        while(num > 0 ) {
            int digit = num % 10;
            sum = sum + digit;
              num /= 10;
        }
        return sum  ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Sum of the digit is : "+sum(a));

    }
}
