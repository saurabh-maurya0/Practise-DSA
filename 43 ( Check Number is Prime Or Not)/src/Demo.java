import java.util.Scanner;

public class Demo {
    public static void main (String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = sc.nextInt();
     if(num ==2) {
         System.out.println("Number is Prime");
     } else {
         boolean isPrime = true;
         for (int i= 2;i <= Math.sqrt(num); i++) {
             if( num % i == 0) { // n is a multiple of i ( i not equal to 1 or n)
                 isPrime = false;
         }
     }
       if(isPrime == true) {
           System.out.println("Number is Prime");
       } else {
           System.out.println("Number is not Prime");
       }

       }

    }
}
