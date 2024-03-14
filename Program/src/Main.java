public class Main {
    public static void main(String[] args) {
        int a =10;
        int b=2;
        int y = a++ / --b * --a + b++;
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);

    }
}