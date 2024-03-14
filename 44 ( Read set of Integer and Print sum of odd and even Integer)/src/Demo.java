import java.util.*;
public class Demo {
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int num1, num2;
                int Evensum = 0 ;
                int Oddsum = 0;
                System.out.println("Enter No of Integer You want to input");
                num1 =sc.nextInt();
                System.out.println("Enter Set of Number");
                {
                    for(int i = 1; i<=num1; i++){
                        num2 = sc.nextInt();
                        if(num2 % 2 == 0) {
                            Evensum += num2;
                             } else {
                            Oddsum += num2;
                             }
                      }
                }

                System.out.println("Sum of Even Number is : "+Evensum+"\nSum of Odd Number is : "+Oddsum);
               }

        }
