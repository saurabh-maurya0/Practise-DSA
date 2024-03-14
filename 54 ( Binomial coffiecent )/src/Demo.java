public class Demo {
    public static int factorial(int num) {
        int fact=1;
        for(int i=1;i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int BinCoff(int n ,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int BinCoff = fact_n/(fact_r * fact_nmr);
        return BinCoff;
    }

    public static void main(String args[]) {
         System.out.println("Binomial coefficient "+ BinCoff(5,2));
    }
}
