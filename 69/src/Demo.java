public class Demo {
    public static void pattern(int n) {
        //outer-loop 1st Half
        for(int i=1; i<=n; i++) {
            //inner-loop for print the pyramid star = i
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            // inner-loop for print the  spaces = 2(n-i)
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //inner-loop for print the flip pyramid star = i
            for(int l=1; l<=i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // outer-loop for 2nd Half
        for(int i=n; i>=1; i--) {
            // inner-loop for alternate of the  pyramid star = i
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            //inner-loop for the spaces =2(n-i)
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            // inner-loop for the alternate and flip or mirror pyramid star = i
            for(int l=1; l<=i; l++) {
                System.out.print("*");
            }
            // next-line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(7);
    }
}
