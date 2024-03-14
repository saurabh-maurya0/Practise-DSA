// Inverted half pyramid with number
public class Demo {
    public static void pattern(int num) {
        // outer-loop
        for(int i=1; i<=num; i++) {
            //inner-loop
            for(int j=1; j<=num-i+1; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(9);
    }
}
/*
// Inverted half pyramid with number
public class Demo {
    public static void pattern(int num) {
        // outer-loop
        for(int i=1; i<=num; i++) {
            int count = 1;
            //inner-loop
            for(int j=num; j>=i; j--) {
                System.out.print(""+count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(9);
    }
}

 */