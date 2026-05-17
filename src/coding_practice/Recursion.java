import java.util.*;

public class Recursion {
    public static void printDec(int n)
    {
      if(n==0)
      {
        return;
      }
      System.out.println(n);
      printDec(n-1);
    }
    public static void main(String[] args) {
      System.out.println("Recursion example:");
      int n=10;
      printDec(n);
    }
}
