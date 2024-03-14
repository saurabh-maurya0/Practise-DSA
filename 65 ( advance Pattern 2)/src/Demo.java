// Inverted and rotated half pyramid
public class Demo {
    public static void pattern(int row) {
        // Outer - loop
        for (int i = 1; i <= row; i++) {

            // print-spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // print-star (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // next-line code
            System.out.println();
        }
    }
        public static void main(String[] args) {
            pattern(10);
        }
    }

