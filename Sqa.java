import java.util.*;
class SimpleQueue
{
	int ar[]=new int[10];
	int f;
	int r;
	SimpleQueue()
	{
		f=-1;
		r=-1;
	}
	void insertion(int e)
	{
		if(f==-1)
		{
			f=0;
			r=0;
			ar[r]=e;
			r++;
		}
		else if(r==(ar.length-1))
		{
			System.out.println("OVERFLOW!!");
		}
		else
		{
			ar[r]=e;
			r++;
			//r++;
		}
	}
	void deletion()
	{
		if(r==-1)
		{
			System.out.println("UNDERFLOW!!");
		}
		else if(f==r)
		{
			f=-1;
			r=-1;
		}
		else
		{
			f++;
		}
	}
	void print()
	{
		for(int i=f;i<r;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}
}
class Sqa
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		SimpleQueue sq=new SimpleQueue();
		int a=s.nextInt();//Enter 1 to start
		int choice;
		while(s.hasNextInt())
		{
			choice=s.nextInt();
		if(choice==1)
		{
			int el=s.nextInt();
            sq.insertion(el);
            sq.print();
		}
		else if(choice==2)
		{
			sq.deletion();
			sq.print();
		}
		else
		{
			sq.print();
		}
	}
	}
}