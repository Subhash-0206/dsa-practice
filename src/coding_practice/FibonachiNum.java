import java.util.*;

public class FibonachiNum {
    
    public static int fibonachi(int n){
      
      if(n==0 || n==1)
      {
        return n;
      }
      
      return fibonachi(n-2)+fibonachi(n-1);
    }
   
    public static void main(String[] args) {
      System.out.println("n-th fibonachi number from :0,1,1,2,3,5,8,13,21,34,55,89");
      System.out.println("n-th fibonachi number:");
      int fibonachiNum = fibonachi(11);
      System.out.println(fibonachiNum);
     
    }
}
