import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       do {
           System.out.print("Enter a number ");
           int num = sc.nextInt();
           if( num % 10 == 0) {
               continue;
           }
           System.out.println("Your number is : "+num);

       } while(true);
    }
}
