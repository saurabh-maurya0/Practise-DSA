public class Demo {
    public static void update(int marks[]) {
        //update Array
        for(int i=0; i<marks.length; i++) {
            marks[i] =marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = { 97,98,99};
        update(marks);
        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
    }
}
