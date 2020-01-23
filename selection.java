import java.util.*;
class selection
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
		int ind;
		for(int i=0;i<n-1;i++)
		{
			 ind=i;
			for(int j=i+1;j<n;j++)
			{
				if(ar[j]<ar[ind])
					ind=j;
			}
				int temp=ar[ind];
				ar[ind]=ar[i];
				ar[i]=temp;
		}
		System.out.println("Sorted elements");
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}
}