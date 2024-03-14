import java.util.*;
public class Demo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil , pen and eraser ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        float withGST = (totalCost + totalCost * 0.18f);

        System.out.println( " Total Cost -: \nWithout GST : "+totalCost+" \nWithGST : "+withGST);
    }
}
