class BubbleSort {
    public static void main(String[] args) {
        
         //Bubble sort
        int ar[] = {9,1,2,5,4,7,-1};
        System.out.println("Bobble sort of the array:");
        int n = ar.length;
        for(int round=1; round<= n-1; round++)
        {
            for(int i=0; i<n-round;i++)
            {
                if(ar[i]>ar[i+1])
                {
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }
        }
        System.out.println("Array after Bubble sort:");
        for(int i:ar)
        {
            System.out.print(i+" ");
        }
       
    }
}
