import java.util.*;
 class LLb
{
	 Node head=null;
	  class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
public LLb insert(LLb l,int d)
{
	Node newnode=new Node(d);
	newnode.next=null;
	Node ptr=l.head;
	if(l.head==null)
		l.head=newnode;
	else
		{ptr=l.head;
	while(ptr.next!=null)
	{
		ptr=ptr.next;
	}
	ptr.next=newnode;}
	return l;
}
public LLb sub(LLb a,LLb b,LLb c)
{
	
}
public  void printList(LLb l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class subraction
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		LLb obj1=new LLb();
		LLb obj2=new LLb();
		LLb obj3=new LLb();
		System.out.println("Enter no of nodes");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int d1,d2;
		for(int i=0;i<n1;i++)
		{
           d1=s.nextInt();
           obj1.insert(obj1,d1);
		}
		for(int i=0;i<n2;i++)
		{
           d2=s.nextInt();
           obj2.insert(obj2,d2);
		}

	}
}




