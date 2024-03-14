public class Demo {
    public static void main(String args[]) {
        int A = 15 , B = 14 , C = 6;

        if(A >= B && A >= C) {
            System.out.println("Largest No is A : "+A);
        }
        else if(B >= C) {
            System.out.println("Largest No is B : "+B);
        }
        else {
            System.out.println("Largest No is C : "+C);
        }
    }
}
