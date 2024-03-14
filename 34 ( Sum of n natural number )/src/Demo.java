  import java.util.*;
  public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = sc.nextInt();
         int counter = 1, sum = 0;

         while(counter <= num ) {
             sum += counter;
             counter++;
         }
         System.out.println("Sum is : "+sum);

    }
}
