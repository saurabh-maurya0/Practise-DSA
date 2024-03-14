public class Demo {
    public static int Binary_Search(int[] num, int key) {
        int start = 0,end =num.length-1;

        while(start<=end) {
            int mid = (start + end) / 2;
            // Comparisions
            if(num[mid] == key) {  //found
                return mid;
                }
            if(num[mid] < key) {  // right
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = { 2,3,4,5,6,7,8,9,10};
        int key = 7;
        System.out.println("Index for key is : "+Binary_Search(number,key));
    }
}
