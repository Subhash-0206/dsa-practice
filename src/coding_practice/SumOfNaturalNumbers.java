import java.util.*;

public class SumOfNaturalNumbers {
    
    public static int sumOfNaturalNumbers(int n){
      
      if(n==0)
      {
        return 0;
      }
      return n + sumOfNaturalNumbers(n-1);
     
    }
   
    public static void main(String[] args) {
      System.out.println("sum of n natural numbers:");
      int sum = sumOfNaturalNumbers(10);
      System.out.println(sum);
     
    }
}
