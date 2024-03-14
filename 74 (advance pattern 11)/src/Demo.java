public class Demo {
    public static void pattern(int num) {
        // outer-loop
        for(int i=1; i<=num; i++) {
            //print-space
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            //print-number Descending order
            for(int k=i; k>=1; k--) {
                System.out.print(k);
            }
            //print-flip number on Ascending order
            for(int l=2; l<=i; l++) {
                System.out.print(l);
            }
            //next-line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(9);

    }
}
