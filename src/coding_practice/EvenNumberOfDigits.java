public class EvenNumberOfDigits
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int ar[] = {12,345,3,8,990};
		int ans=0;
		for(int a: ar)
		{
		    int count=0;
		    while(a>0)
		    {
		        a=a/10;
		        count++;
		    }
		    if(count%2==0) ans++;
		}
		
		System.out.println("Even number of digits of nums : "+ans);
	}
}
