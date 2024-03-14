// write a program to create a solid rhombus pattern
public class Demo {
    public static void pattern(int n) {
      // outer-loop
        for(int i=1; i<=n; i++) {
            // print space (n to i)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print star n times
            for(int k=1; k<=n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(5);
    }
}
