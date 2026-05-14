class SelectionSort {
    public static void main(String[] args) {
        
         //Selection sort
        int ar[] = {9,1,2,5,4,7,-1};
        System.out.println("Selection sort of the array:");
        int n = ar.length;
        for(int round=0; round < n-1; round++)
        {
            int minIdx = round;
            for(int i=round+1;i<n;i++)
            {
                if(ar[i]<ar[minIdx])
                {
                    minIdx =i;
                }
            }
            //swap round, minIdx
            int temp = ar[round];
            ar[round] = ar[minIdx];
            ar[minIdx] = temp;

        }
        System.out.println("Array after Selection sort:");
        for(int i:ar)
        {
            System.out.print(i+" ");
        }
       
    }
}
