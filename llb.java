import java.util.*;
 class LLb
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
public static LLb insert(LLb l,int d)
{
	Node newnode=new Node(d);
	//newnode.next=null;
	newnode.data=d;
	newnode.next=l.head;
	return l;
}
public static void printList(LLb l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class ab
{
	public static void main(String[] args) 
	{
		int d=30;
		LLb obj1=new LLb();
		int a;
		//LL obj2=new LL();
		obj1.insert(obj1,d);
        obj1.insert(obj1,50);
        obj1.insert(obj1,40);
        obj1.insert(obj1,60);
        //obj1.insert(obj1,70);
		obj1.printList(obj1);
	}
}




