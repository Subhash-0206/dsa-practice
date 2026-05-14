package coding_practice;

public class SortedSquaresArrayTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using two pointers technique
		int ar[] = {-4,-1,0,3,10};
		int ans[] = new int[ar.length];
		int l=0;
		int r=ar.length-1;
		int idx=r;
		System.out.println("Array elements before:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		while(idx>=0)
		{
			if(ar[r]*ar[r]>ar[l]*ar[l])
			{
				ans[idx--]=ar[r]*ar[r];
				r--;
			}
			else {
				ans[idx--]=ar[l]*ar[l];
				l++;
			}
		}
		System.out.println("\nSorted squares of array elements:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

}
