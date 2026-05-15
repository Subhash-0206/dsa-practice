import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
      //InsertionSort
      System.out.println("Insertion sort");
      int ar[] = {9,1,2,5,4,7,-1};
      int n= ar.length;
      
      System.out.println("Array before sorting:");
      for(int i:ar)
      {
        System.out.print(i+" ");
      }
      
      for(int round=1; round<n;round++)
      {
        int i=round;
        while(i>0 && ar[i]<ar[i-1])
        {
          //swap ar[i], ar[i-1]
          int temp = ar[i];
          ar[i] = ar[i-1];
          ar[i-1] = temp;
          i--;
        }
      }
      System.out.println("\nArray after insertion sort:");
      for(int i:ar)
      {
        System.out.print(i+" ");
      }
    }
}
