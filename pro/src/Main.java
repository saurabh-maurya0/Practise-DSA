import java.util.Scanner;

/*
the prime only when it is divisible by with own no or 1

like :
          6/2=0
          5/2=1

          6 =  2x3   3x2
 */


public class Main {

    public static boolean isprime(int num ){

        if(num==2){
            return true ;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

// write the programme to find the no is prime or not
   int num []= {32,6,7,8,5,235,634,34,7,34};

   for(int i=0; i<num.length; i++) {
       boolean result = isprime(num[i]);
       if (result) {
           System.out.println("Num is prime : "+num[i]);
       } else {
           System.out.println("Num is not prime : "+num[i]);
       }
   }

}}