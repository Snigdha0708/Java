import java.util.*;
 class LLc
{
	static Node head=null;
	static  class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
public static LLc insertf(LLc l,int d)
{

	Node newnode=new Node(d);
	//newnode.next=null;
	newnode.data=d;
	newnode.next=l.head;
	l.head=newnode;
	return l;
}
public static LLc insert(LLc l,int d,int p)
{
	Node newnode=new Node(d);
	newnode.next=null;
	Node n=l.head;
	if(p==0)
		insertf(l,d);
	else
	{
		for(int i=0;i<p-1;i++)
		{
             n=n.next;
		}
		newnode.next=n.next;
		n.next=newnode;
	}
	return l;
}
public static LLc delete(LLc l,int d)
{
	Node newnode=l.head;
	Node n=null;
	if(newnode!=null&&newnode.data==d)
	{
		l.head=newnode.next;
		return l;
	}
	else
	{
	while(newnode!=null&&newnode.data!=d)
	{
		n=newnode;
		newnode=newnode.next;
	}
	if(newnode==null)
	{
		return l;
	}
	else
	{
		n.next=newnode.next;
	}
}
return l;
}
public static LLc deletek(LLc l,int d,int k)
{
	
}
public static void printList(LLc l)
{
	Node ptr1=l.head;
	while (ptr1!=null) 
	{
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class cd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		LLc obj1=new LLc();
		System.out.println("Enter no of nodes");
		int n=s.nextInt();
		int data;
		for(int i=0;i<n;i++)
		{
            data=s.nextInt();
            obj1.insertf(obj1,data);
		}
		obj1.insert(obj1,20,2);
		obj1.delete(obj1,40);
		obj1.printList(obj1);
	}
}




