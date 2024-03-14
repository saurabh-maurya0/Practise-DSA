public class Demo {
    public static void pattern(int num) {
        //outer-loop
        for(int i=1; i<=num; i++) {
            //print the space
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            //print hollow rhombus
            for(int k=1; k<=num; k++) {
                //print boundary star
                if(i==1 || i==num || k==1 || k==num) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // call method by passing value
        pattern(5);
    }
}
