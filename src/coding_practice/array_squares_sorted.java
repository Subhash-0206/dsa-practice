package coding_practice;

public class array_squares_sorted {
    public static void main(String[] args) {
        System.out.println("sorted squares of array:");
        int ar[] = {-4,0,5,6,-3};
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=ar[i]*ar[i];
        }
        System.out.println("before sorting...");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            
            }
        }
        System.out.println("\nafter sorting...");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
