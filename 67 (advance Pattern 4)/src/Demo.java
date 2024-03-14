// Write a program to print Floyd's triangle pattern:
public class Demo {
    public static void pattern(int rows) {
        int count = 1;
        // outer-loop
        for(int i=1; i<=rows; i++) {
            // inner-loop
            for(int j=1; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void  main(String[] args) {
        pattern(5);
    }
}
