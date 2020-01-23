import java.util.*;
 class LLde
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
public static LLde insert(LLde l,int d)
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
public static LLde sb(LLde l)
{
	Node ptr=l.head;
	Node n=l.head;
	//int a;
	while(ptr.next!=null)
	{
     //a=ptr.next.data;
     ptr=ptr.next;
	}
    int temp;
    temp=ptr.data;
    ptr.data=n.data;
    n.data=temp;
    return l;
}
public static void printList(LLde l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class swap
{
	public static void main(String[] args) 
	{
		int d=30;
		LLde obj1=new LLde();
		//int a;
		//LL obj2=new LL();
		obj1.insert(obj1,d);
        obj1.insert(obj1,50);
        obj1.insert(obj1,40);
        obj1.insert(obj1,60);
        //obj1.insert(obj1,70);
		obj1.printList(obj1);
		obj1.sb(obj1);
			obj1.printList(obj1);
        //System.out.println(b);
		//obj2.printList(obj2);
	}
}