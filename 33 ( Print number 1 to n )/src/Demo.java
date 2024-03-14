import java.util.*;
public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int range = sc.nextInt();
        int num = 1;

        while(num <= range) {
            System.out.print(num+" ");
            num++;
        }
    }
}
