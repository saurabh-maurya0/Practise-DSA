import java.util.*;
public class Demo {
    public static int sum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num");
        int a = sc.nextInt();
        int b = sc.nextInt();
      // int s = sum(a,b);
       System.out.println("The sum is "+sum(a,b));

    }
}
