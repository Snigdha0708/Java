import java.util.*;
class SimpleQueue
{
	Node f;
	Node r;
    Node head=null;
    class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}
     void insertion(int d)
	{
		Node newnode=new Node(d);
		head=newnode;
        f=head;
        r=head;
        r.next=newnode;
        r=newnode;
	}
	void deletion()
	{
		f=f.next;
		if(f==r)
		{
			f=null;
			r=null;
		}
	}
	void print()
	{
		Node ptr=head;
		while(ptr.next!=null)
		{
			System.out.print(ptr.data+"->");
			ptr=ptr.next;
		}
	}
}
class Sql
{
	public static void main(String[] args) {
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
            //sq.print();
		}
		else if(choice==2)
		{
			sq.deletion();
			//sq.print();
		}
		else
		{
			sq.print();
		}
	}
	}
	}