//   Reverse an Array
public class Demo {
    public static void reverseArray(int[] number) {
        int start = 0, last = number.length-1;
        while(start < last) {
            //swap :
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;
            // update :
              last--;
              start++;
        }
    }
    public static void main(String[] args) {
        int number[] = { 3,5,6,7,8,9};
        //method call :
        reverseArray(number);
        // print :
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i]+" ");
        }
        // next-line :
        System.out.println();
    }
}
