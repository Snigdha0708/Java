import java.util.*;
 class Linked
{
	static Node head=null;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			this.data=d;
		}
	}
	public static Linked insert_beg(Linked l,int d)
	{
		Node newnode=new Node(d);
		newnode.next=l.head;
		l.head=newnode;
		return l;
	}
	public static Linked insert_end(Linked l,int d)
	{
		Node newnode=new Node(d);
		if(l.head==null)
			l.head=newnode;
		else
		{
			Node ptr=l.head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
		}
		return l;
	}
	public static Linked insert_pos(Linked l,int d,int p)
	{
		Node newnode=new Node(d);
		if(p==0)
		{
			insert_beg(l,d);
		}
		else
		{
			Node ptr=l.head;
			int c=0;
			while(c<p-1)
			{
             ptr=ptr.next;
             c++;
			}
			Node temp;
			temp=ptr.next;
			ptr.next=newnode;
			newnode.next=temp;
		}
		return l;
	}
	public static Linked delete_beg(Linked l)
	{
		if(l.head==null)
			//System.out.println("Empty");
			return null;
		else
		{
			l.head=l.head.next;
		}
	   return l;
	}
	public static Linked delete_end(Linked l)
	{
		if(l.head==null)
			return null;
		else if(l.head.next==null)
			return null;
		else
		{
			Node ptr=l.head;
			while(ptr.next.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=null;
		}
		return l;
	}
	public static Linked delete_pos(Linked l,int p)
	{
		Node ptr=l.head;
		if(p==0)
			delete_beg(l);
		else
		{
			int c=0;
			while(c<p-1)
			{
				ptr=ptr.next;
				c++;
			}
			Node temp=ptr.next.next;
			ptr.next=temp;
		}
		return l;
	}
	public static Linked reverse(Linked l)
	{
		Node curr=l.head;
		Node prev=null;
		Node n=null;
		while(curr!=null)
		{
          n=curr.next;
          curr.next=prev;
          prev=curr;
          curr=n;
		}
		l.head=prev;
		return l;
	}
	public static boolean pal(Linked l)
	{
		Node ptr=l.head;
		int c=0;
		while(ptr!=null)
		{
			c++;
			ptr=ptr.next;
		}
		Stack<Integer> st=new Stack<Integer>();
		int flag=-1;
		if(c%2==0)
		{
			int p=0;
			Node n=l.head;
          while(p<c/2)
          {
               st.push(n.data);
               n=n.next;
               p++;
          }
          //int flag=0;
          while(!st.isEmpty())
          {
          	if(st.pop()==n.data)
          		flag=1;
          	else
          		flag=0;
          	n=n.next;
          }
		}
		else
		{
			int p=0;
			Node n=l.head;
          while(p<c/2)
          {
               st.push(n.data);
               n=n.next;
               p++;
          }
          n=n.next;
         // int flag=0;
          while(!st.isEmpty())
          {
          	if(st.pop()==n.data)
          		flag=1;
          	else
          		flag=0;
          	n=n.next;
          }
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public static Linked delete_val(Linked l,int v)
	{
		Node ptr=l.head;
		while(ptr.next.data!=v)
		{
			ptr=ptr.next;
		}
		Node temp=ptr.next.next;
        ptr.next=temp;
        return l;
	}
	public static void display(Linked l)
	{
		 Node ptr=l.head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+"->");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
class LinkedList
{
	public static void main(String[] args) 
	{
		Linked ld=new Linked();
		ld.insert_end(ld,1);
		ld.insert_end(ld,2);
        ld.insert_end(ld,2);
        ld.insert_pos(ld,1,3);
        ld.display(ld);
        boolean a=ld.pal(ld);
        ld.delete_val(ld,2);
        //System.out.println(a);
        //ld.reverse(ld);
        //ld.delete_pos(ld,2);
        //ld.display(ld);
        //ld.delete_pos(ld,1);
		//ld.delete_end(ld);
		//ld.delete_beg(ld);
		ld.display(ld);
	}
}