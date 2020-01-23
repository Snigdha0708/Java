import java.util.*;
class insertion
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Size");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		for(int i=1;i<n;i++)
		{
			int val=ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>val)
			{
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=val;
		}
		System.out.println("Sorted elements");
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}
}