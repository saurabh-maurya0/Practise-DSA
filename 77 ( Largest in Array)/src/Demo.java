public class Demo {
    public static int array(int[] a) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i=0; i<a.length; i++) {
            if( largest < a[i]) {
                largest = a[i];
            }
            if(smallest > a[i]) {
                smallest = a[i];
            }
        }
        System.out.println("Smallest No :"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] number = {2,6,64,67,43,1,68,5};
        int largest_number = array(number);
        System.out.println("Largest number : "+largest_number);
    }
}
