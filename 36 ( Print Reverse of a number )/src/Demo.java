public class Demo {
    public static void main(String args[]) {
         int n = 987861799;

        while ( n > 0 ) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n /   10;
        }
        System.out.println();
    }

}
