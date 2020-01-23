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
	l.head=newnode;
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
		Scanner s=new Scanner(System.in);
		LLb obj1=new LLb();
		System.out.println("Enter no of nodes");
		int n=s.nextInt();
		int data;
		for(int i=0;i<n;i++)
		{
            data=s.nextInt();
            obj1.insert(obj1,data);
		}
		obj1.printList(obj1);
	}
}




