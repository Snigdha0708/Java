import java.util.*;
class Doll
{
	 Node head=null;
	 Node tail=null;
	 class Node
	{
		int d;
		Node next=null;
		Node prev=null;
		Node(int d)
		{
			this.d=d;
		}
	}
	public  Doll ib(Doll l,int d)
	{
		Node newnode=new Node(d);
		if(l.head==null)
		{
			l.head=newnode;
			l.tail=newnode;
		}
		else
		{
			newnode.next=l.head;
			l.head.prev=newnode;
			l.head=newnode;
		}
		return l;
	}
	public  Doll ie(Doll l,int d)
	{
         Node newnode=new Node(d);
         if(l.tail==null)
         {
         	l.tail=newnode;
         	l.head=newnode;
         }
         else
         {
         	l.tail.next=newnode;
         	newnode.prev=l.tail;
         	l.tail=newnode;

         }
         return l;
	}
	public  void display(Doll l)
	{
		Node ptr=l.head;
		while(ptr!=null)
		{
			System.out.print(ptr.d+"->");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
class DLLL
{
	public static void main(String[] args) {
		Doll df =new Doll();
		df.ib(df,10);
		df.ib(df,20);
		df.ib(df,30);
		df.display(df);
		df.ie(df,10);
		df.ie(df,20);
		df.ie(df,30);
		df.display(df);
	}
}