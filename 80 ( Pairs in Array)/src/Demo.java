public class Demo {
    public static void pair(int[] number) {
        int count=0;
        for(int i=0; i<number.length; i++) {
            for(int j=i+1; j<number.length; j++) {
                count++;
                //print-pair
                System.out.print("("+number[i]+","+number[j]+") ");
            }
            System.out.println();
        }
        System.out.println("Total number of pair : "+count);
    }
    public static void main(String[] args) {
        int[] number = {2,4,5,6,7,8,9};
        //method-call
        pair(number);

    }

}
