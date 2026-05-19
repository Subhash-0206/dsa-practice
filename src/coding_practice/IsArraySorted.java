import java.util.*;

public class IsArraySorted {
    
    public static Boolean isArraySorted(int[] ar, int i){
      
      if(i==ar.length-1)
      {
        return true;
      }
      if(ar[i]>ar[i+1])
      {
        return false;
      }
      
      return isArraySorted(ar, i+1);
    
    }
   
    public static void main(String[] args) {
      
      System.out.println("Is array sorted?");
      int ar[] = {1,2,6,3,4,5};
      System.out.println(isArraySorted(ar, 0));
    }
}
