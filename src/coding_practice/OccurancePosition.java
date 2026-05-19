import java.util.*;

public class OccurancePosition {
    
    public static int firstOccurance(int[] ar, int k, int i){
      
      if(i==ar.length)
      {
        return -1;
      }
      if(ar[i]==k)
      {
        return i;
      }
      return firstOccurance(ar, k, i+1);
    }
    
    public static int lastOccurance(int[] ar, int k, int i){
      
      if(i==ar.length)
      {
        return -1;
      }
      int found = lastOccurance(ar, k, i+1);
      if(found != -1)
      {
        return found;
      }
      if(ar[i]==k)
      {
        return i;
      }
      return -1;
    }
   
   
    public static void main(String[] args) {
      
      System.out.println("occurance:");
      int ar[] = {1,2,6,20,4,2,5,20,21};
      //System.out.println(firstOccurance(ar, 20, 0));
      System.out.println(lastOccurance(ar, 2, 0));
    }
}
