import java.util.*;

public class RecursionPractice {
    
    public static void print(int n){
      if(n==1)
      {
        System.out.println(n);
        return;
      }
      print(n-1);
      System.out.println(n);
    }
    public static void printDecreasing(int n)
    {
      if(n==1)
      {
        System.out.println(n);
        return;
      }
      System.out.println(n);
      printDecreasing(n-1);
    }
    public static void main(String[] args) {
      System.out.println("recursion post printing:");
      print(10);
      System.out.println("recursion pre printing:");
      printDecreasing(10);
    }
}
