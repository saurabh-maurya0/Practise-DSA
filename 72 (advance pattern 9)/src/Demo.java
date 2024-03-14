public class Demo {
    public static void pattern(int n) {
      // outer-loop
        for(int i=0; i<=n; i++) {
            //print space n-i
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print star 2*i-1 (odd no)
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
       // outer-loop
        for(int i=n; i>=1; i--) {
            //print space n-i
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print star 2*i-1 (odd no)
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
   }


    public static void main(String[] args) {
        pattern(5);
    }
}




/*
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            for(int l=1; l<=i-1;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            for(int l=1; l<=i-1;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 */