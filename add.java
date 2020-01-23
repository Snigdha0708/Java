import java.util.*;
 class Linked
{
	 Node head=null;
	 class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			this.data=d;
		}
	}
	public  Linked insert(Linked l,int d)
	{
		ode newnode=new Node(d);
		newnode.next=l.head;
		l.head=newnode;
		return l;
	}
	public void display(Linked l)
	{
		//System.out.println(l.head.data);
		 Node ptr=l.head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+"->");
			ptr=ptr.next;
		}
		System.out.println();
	}
	public void a(Linked l1,Linked l2)
	{
		Node ptr1=l1.head;
		Node ptr2=l2.head;
		while(ptr1.next!=null)
		{
			ptr1=ptr1.next;
		}

	}
}
class add
{
	public static void main(String[] args)
	 {
		Linked l1=new Linked();
		Linked l2=new Linked();
		l1.insert_end(l1,1);
		l1.insert_end(l1,2);
        l1.insert_end(l1,2);
        l1.display(l1);
	}
}