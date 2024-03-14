public class Demo {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String args[]) {
        System.out.println("Sum is : "+sum(2,4));
        System.out.println("Sum is  : "+sum(3.3f,32.3f));
    }
}
