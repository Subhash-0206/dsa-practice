class MinTimeToVisitAllPoints {
    public static void main(String[] args) {
        
         //MinTimeToVisitAllPoints - leetcode 1266
        int[][] ar = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println("Length of array="+ar.length);
        int n=ar.length;
        int x1=ar[0][0];
        int y1=ar[0][1];
        int x2=0; int y2=0;
        int totalTime=0;
        for(int i=1;i<n;i++)
        {
            x2=ar[i][0];y2=ar[i][1];
            totalTime+=Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
            x1=x2;y1=y2;
        }
        System.out.println("MinTimeToVisitAllPoints="+totalTime);
    }
}
