import java.util.*;
class DoublyLinkedList
{
	static Node head=null;
	static Node tail=null;
	static class Node
	{
      int data;
      Node next;
      Node prev;
      Node(int d)
      {
      	this.data=d;
      }
	}
	public static DoublyLinkedList del_pos(DoublyLinkedList l,int p)
	{
		int count=0;
		Node ptr=l.head;
		if(p==count)
		{
			l.head=l.head.next;
			l.head.prev=null;
		}
		else
		{
			while(count<p)
			{
              ptr=ptr.next;
              count++;
			}
			Node a=ptr;
			ptr=ptr.next.next;
            ptr.prev.prev=a;
		}
		return l;
	}
	public static DoublyLinkedList insert_begin(DoublyLinkedList l,int d)
	{
		Node newnode=new Node(d);
		if(l.head==null)
		{
			l.head=newnode;
			l.tail=newnode;
			System.out.println("Node Inserted");
			displayf(l);
		}
		else
		{
			newnode.next=l.head;
			l.head.prev=newnode;
			l.head=newnode;
			System.out.println("Node Inserted");
			displayf(l);
		}
		return l;
	}
	public static DoublyLinkedList insert_end(DoublyLinkedList l,int d)
	{
		Node newnode=new Node(d);
		if(l.tail==null)
		{
			l.head=newnode;
			l.tail=newnode;
			System.out.println("Node Inserted");
			displayf(l);
		}
		else
		{
			tail.next=newnode;
			newnode.prev=l.tail;
			l.tail=newnode;	
			System.out.println("Node Inserted");
			displayf(l);
				}
			return l;
	}
	public static void displayf(DoublyLinkedList l)
	{
		Node ptr;
		ptr=l.head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
	public static void displaye(DoublyLinkedList l)
	{
		Node ptr;
		ptr=l.tail;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.prev;
		}
	}
	public static DoublyLinkedList delete_beg(DoublyLinkedList l)
	{
		if(l.head==null)
		{
			System.out.println("Empty");
		}
		else if(l.head.next==null)
		{
			l.head=null;
			displayf(l);
		}
		else
		{
			//Node ptr;
			//ptr=l.head;
			l.head=l.head.next;
			l.head.prev=null;
			displayf(l);
		}
		return l;
	}
	public static DoublyLinkedList delete_end(DoublyLinkedList l)
	{
		if(l.tail==null)
		{
			System.out.println("Empty");
		}
		else if(l.tail.prev==null)
		{
			l.tail=null;
			l.head=null;
			displayf(l);
		}
		else
		{
			//Node ptr;
			//ptr=l.head;
			l.tail=l.tail.prev;
			l.tail.next=null;
			displayf(l);
		}
		return l;
	}
}
class dl
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int n=s.nextInt();
        int d[]=new int[n];
        DoublyLinkedList ds=new DoublyLinkedList();
        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
          d[i]=s.nextInt();
          //ds.insert_begin(ds,d[i]);
        }
       System.out.println("Enter choice");
        int choice=s.nextInt();//1-insert_beg,2-insert-end\
        if(choice==1)
        {
        	System.out.println("BEGINING");
        	for(int i=0;i<n;i++)
        	{
        		ds.insert_begin(ds,d[i]);
        	}
        }
        else if(choice==2)
        {
        	System.out.println("ENDING");
        	for(int i=0;i<n;i++)
        	{
        		ds.insert_end(ds,d[i]);
        	}
        }
        //ds.displaye(ds);
        System.out.println("Deletion");
       // ds.delete_end(ds);
        //ds.delete_end(ds);
        ds.del_pos(ds,1);
	}
}