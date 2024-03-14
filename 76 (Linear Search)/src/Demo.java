public class Demo {
    public static int linear_search(int[] num, int key) {
        for(int i=0; i<num.length; i++) {
            if(num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number = { 1,33,4,3,5,56,76,32,19};
        int key = 6;
       int value = linear_search(number,key);
       if(value==-1) {
           System.out.println("key is not found");
       }
       else {
           System.out.println("key index is : "+value);
       }

    }
}
