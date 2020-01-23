import java.util.*;
 class LL
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
public static LL insert(LL l,int d)
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
public static void printList(LL l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class lla
{
	public static void main(String[] args) 
	{
		int d=30;
		LL obj1=new LL();
		obj1.insert(obj1,d);
		obj1.printList(obj1);
	}
}




