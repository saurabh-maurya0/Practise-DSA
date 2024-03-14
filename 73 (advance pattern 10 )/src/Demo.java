// write a program to print number pyramid pattern
public class Demo {
    public static void pattern(int num) {
        //outer-loop
        for(int i=1; i<=num; i++) {
            // print-space
            for(int j=1; j<=num-i; j++ ) {
                System.out.print(" ");
            }
            //print-num as the loop will execute
            for(int k=1; k<=i; k++) {
                System.out.print(i+" ");
            }
            // next-line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(9);
    }
}
