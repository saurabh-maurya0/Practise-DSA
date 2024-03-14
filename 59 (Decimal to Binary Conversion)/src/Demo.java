public class Demo {
    public static void decToBinary(int num) {
        int myNum = num;
        int bin = 0;
        int pow = 0;
        while( num > 0) {
            int remainder = num % 2;
            bin = bin + (remainder * (int)Math.pow(10,pow));
            pow++;
            num = num / 2;
        }
        System.out.println("Binary of "+myNum+" is : "+bin);
    }
    public static void main(String[] args) {
        decToBinary(5);
    }
}
