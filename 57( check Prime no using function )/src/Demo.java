public class Demo {
    public static boolean isprime(int num) {
        if(num==2) {
            return true;
        }
         for(int i=2; i<=Math.sqrt(num); i++) {
             if(num%2==0) {
                 return false;
             }
         }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isprime(19));
    }
}
