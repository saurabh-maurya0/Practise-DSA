// Check the number is palindrome or not :
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , revNum=0;
        System.out.println("Enter the number : ");
         num = sc.nextInt();
         int copyNum = num;
         while (copyNum > 0) {
            int rem = copyNum % 10;
             revNum = revNum*10 + rem;
             copyNum = copyNum/10;
         }
         if(num==revNum) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not Palindrome :");
         }


    }
}
