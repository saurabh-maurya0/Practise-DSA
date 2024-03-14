//Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method.
import java.util.*;
public class Demo {
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("Even No :");
        }
        else {
            System.out.println("Odd No :");
        }
    }
}
