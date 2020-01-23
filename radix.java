import java.util.*;
class radix
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
        for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		//int arr[][]=new int[10][10];
		//static int max_num()
		int max=ar[0];
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		int count=0;
		while(max>0)
		{
			count++;
			max=max/10;
		}
		int m=10;
		int d=1;
       for(int u=0;u<count;u++)
        {
        	int k=0;
        	int r=0;
        	int arr[][]=new int[10][100];
        	int c[]=new int[n];
        	for(int j=0;j<n;j++)
        	{
        		 r=ar[j]%m;
        		 r=r/d;
                 arr[r][c[r]]=ar[j];
                 c[r]++;
        	}
        	m=m*10;
        	d=d*10;
        	for(int i=0;i<n;i++)
        	{
        		for(int j=0;j<c[i];j++)
        		{
        			//System.out.print(arr[i][j]+",");
        			ar[k]=arr[i][j];
        			k++;
        		}
        	}
       }
        for(int i=0;i<n;i++)
        	System.out.print(ar[i]+",");
	}
}