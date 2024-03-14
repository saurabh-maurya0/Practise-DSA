import java.util.Scanner;

public class Demo {
     public static void main(String[] args) {
      String str = "          dkajlkd                d dda      fjda lkd ad dkd     ";
        str = str.replaceAll("\\s+"," ").trim();
      String w[] = str.split("\\s");
      System.out.println(w);

     }
}
