import java.util.*;
class merge
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Size1");
		int n=s.nextInt();
		int ar1[]=new int[n];
		System.out.println("Size2");
		int m=s.nextInt();
		int ar2[]=new int[m];
		System.out.println("Enter elements of a1");
		for(int i=0;i<n;i++)
			ar1[i]=s.nextInt();
		System.out.println("Enter elements of a2");
		for(int i=0;i<m;i++)
			ar2[i]=s.nextInt();
		int ar3[]=new int[n+m];
		int x=0;
		int y=0;
		int z=0;
		while(z<=x||z<=y)
		{
			if(ar1[x]<=ar2[y])
			{
				ar3[z]=ar1[x];
				z++;
				x++;
			}
			else 
			{
				ar3[z]=ar2[y];
				z++;
				y++;
			}
		}
		if(x!=n)
		{
			while(x!=n)
			{
				ar3[z]=ar1[x];
				z++;
				x++;
			}
		}
		else
		{
		 while(y!=m)
			{
				ar3[z]=ar2[y];
				z++;
				y++;
			}	
		}
		System.out.println("Sorted elements");
		for(int i=0;i<n+m;i++)
			System.out.println(ar3[i]);
	}}