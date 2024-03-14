class Test {
    public String name;
    public String email;

    public Test(String name, String email) {
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return email+" \n"+name+"";
    }
    public String tring() {
        return email+" \n";
    }
}


public class Main {
    public static void main(String[] args) {
Test t=new Test("deepak", "deep@gmail.com");
System.out.println(t.tring());




    }
}