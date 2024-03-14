//write a program to print 0-1 triangle pattern
public class Demo {
    public static void pattern(int num) {
        //outer-loop
        for(int i=1; i<=num; i++) {
            // inner-loop
            for(int j=1; j<=i; j++) {
                // if i or j are Even no:
             if((i+j) % 2 == 0) {
                 System.out.print("1");
             }
             // if i 0r j are Odd no:
             else {
                 System.out.print("0");
             }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }

}



/*
 public static void pattern(int num) {
        //outer-loop
        for(int i=1; i<=num; i++) {
            // inner-loop
            for(int j=1; j<=i; j++) {
                // if i or j are Even no:
             if( i % 2 == 0 && j % 2 != 0 ||  j % 2 == 0 && i % 2 != 0) {
                 System.out.print("0");
             }
             // if i 0r j are Odd no:
             else {
                 System.out.print("1");
             }
            }
            System.out.println();
        }
    }
 */
