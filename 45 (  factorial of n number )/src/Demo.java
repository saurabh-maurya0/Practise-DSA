import java.util.Scanner;

public class Demo {
          public static void main (String args[]) {
              Scanner sc = new Scanner(System.in);
              int fact = 1 ;
              System.out.println("Enter the number");
              int num = sc.nextInt();
              for(int i=num; i>=1; i--) {
                  fact *= i;
              }
              System.out.print("Factorial of "+num+" is : "+fact);

          }
}
