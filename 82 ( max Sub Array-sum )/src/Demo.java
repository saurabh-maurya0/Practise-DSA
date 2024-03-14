public class Demo {
    public static void maxSubarray_sum(int[] number) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            for(int j=i; j<number.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += number[k];
                    }
                System.out.println("Current sum : "+sum);
                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(" Max Sum is : "+maxSum);
    }
    public static void method() {
        String a = "saurabh";
        String b = "Maurya";
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int[] number ={2,4,6,8,10};
   maxSubarray_sum(number);
   method();
    }
}
