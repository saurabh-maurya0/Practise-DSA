public class Demo {
    public static void main(String args[]) {
        int num = 4;
           for(int line=1; line<=num; line++) {
               for(int j=1; j<=num-line+1; j++) {
                   System.out.print("*");
               }
               System.out.println();
           }
    }
}
