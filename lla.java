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
public static int count(LL l)
{
	int c=0;
	Node ptr1=l.head;
	while (ptr1!=null) {
		c++;
		ptr1=ptr1.next;
	}
	//System.out.println("Count="+c);
	return c;
}
public static void mid(LL l,int c)
{
	int a=0;
	Node ptr1=l.head;
	while(a!=(c/2))
	{
		ptr1=ptr1.next;
		a++;
	}
	System.out.println("Mid element="+ptr1.data);
}
public static void mida(LL l)
{
	Node ptr1=l.head;
	Node ptr2=l.head;
	while((ptr2!=null)&&(ptr2.next!=null))
	{
		ptr1=ptr1.next;
		ptr2=ptr2.next.next;
	}
	System.out.println("Mid element="+ptr1.data);
}
public static int search(LL l,int d)
{
	int c=0;
	Node ptr1=l.head;
	while (ptr1.data!=d) {
		c++;
		ptr1=ptr1.next;
	}
	return c;
}
}
class lla
{
	public static void main(String[] args) 
	{
		int d=30;
		LL obj1=new LL();
		int a;
		//LL obj2=new LL();
		obj1.insert(obj1,d);
        obj1.insert(obj1,50);
        obj1.insert(obj1,40);
        obj1.insert(obj1,60);
        //obj1.insert(obj1,70);
		obj1.printList(obj1);
		a=obj1.count(obj1);
		obj1.mid(obj1,a);
		obj1.mida(obj1);
		int b;
		b=obj1.search(obj1,50);
        System.out.println(b);
		//obj2.printList(obj2);
	}
}




