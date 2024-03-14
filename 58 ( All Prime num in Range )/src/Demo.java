public class Demo {
    public static boolean isPrime(int num) {
        if(num==2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int num) {
        for(int i=2; i<=num; i++) {
            if(isPrime(i)== true) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num=100;
        System.out.println("All Prime num between 2 to "+num);
        primeRange(num);
    }
}
