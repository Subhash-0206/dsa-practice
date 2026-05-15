class CountSort {
    public static void main(String[] args) {
        System.out.println("count sort"); 

        //CountSort
        int ar[] = {1,5,5,4,4,7,7,8,4,9,8,5,6,7,6,9};
        int n = ar.length;
        int count[] = new int[10];
        //constraint given is 10, so len of count array is 10

        for(int i=0;i<n; i++)
        {
            count[ar[i]]++;
        }
        for(int i:count)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nArray after count sort:");
        for(int i=0;i<10;i++)
        {
            while(count[i]>0)
            {
                System.out.print(i+" ");
                count[i]--;
            }
        }
    }
}
