public class Demo {
    public static void countingSort(int[] arr) {
        // find largest number in the array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest+1];                       // here largest+1 because we start 0-largest value if largest value is 7 so we have to take 0-7 which size 
        for(int i=0; i<arr.length; i++) {                      // of the element is 8 that is the main reasion
            count[arr[i]]++;                                  // jo hamra realno original array me  hai usse count ka index ki tarah lena aur cout me jana hai usse ++ ker dena hai
        }
        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;                                    // here i is a real no (which is index of count ) which is store in side original array 
                j++;                                          // original array index increase
                count[i]--;                                  // count array ke ander jo value store hai wo yah batati hai ke koi no kitne barr aaya hai usse hum one by one decrease karenge
            }
        }
    }
                                                         // for printing purpose we have to create a method
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={5, 3, 6, 3, 6, 3, 2,1};
        countingSort(arr);
        print(arr);


    }
}
