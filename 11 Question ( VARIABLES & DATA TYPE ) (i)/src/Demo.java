import java.util.*;
public class Demo {
    public static void main(String args[])
    {
        /*
               Average of 3 number using Scanner
         */

        Scanner sc = new Scanner(System.in);
        int a,b,c ;
        float avg;
        System.out.println("Enter the number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg = ( a + b + c )/ 3f;
        System.out.println("average of "+a+" , "+b+" and "+c+"  is : "+avg);

    }

}
