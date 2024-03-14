import java.util.Arrays;

public class Test {
    public static void  OddorEven(int num){
        int bitmask = 1;
        if((num & bitmask) == 0 ){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
OddorEven(5);
OddorEven(4);


    }
}