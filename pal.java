import java.util.*;
 class LLb
{
	 Node head=null;
	  class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
public  LLb insertf(LLb l,int d)
{
	Node newnode=new Node(d);
	//newnode.next=null;
	newnode.data=d;
	newnode.next=l.head;
	l.head=newnode;
	return l;
}
public LLb inserte(LLb l,int d)
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
public  LLb rev(LLb l)
{
  Node nex,prev;
  nex=null;
  prev=null;
  Node curr=l.head;
  while(curr!=null)
  {
  	nex=curr.next;
  	curr.next=prev;
  	prev=curr;
  	curr=nex;
  }
  l.head=prev;
  return l;
}
public  boolean palind(LLb a,LLb b)
{
	Node ptr1=b.head;
	Node ptr2=a.head;
	int flag=-1;
	while (ptr1!=null&&ptr2!=null) {
		if(ptr1.data==ptr2.data)
			flag=1;
		else
			flag=0;
		ptr1=ptr1.next;
		ptr2=ptr2.next;
	}
	if(flag==1)
		return true;
	else
		return false;
}
public  void printList(LLb l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class pal
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		LLb obj1=new LLb();
		LLb obj2=new LLb();
		System.out.println("Enter no of nodes");
		int n=s.nextInt();
		int data;
		for(int i=0;i<n;i++)
		{
            data=s.nextInt();
            obj1.insertf(obj1,data);
            obj2.inserte(obj2,data);
		}
		//obj1.printList(obj1);
		//obj2.rev(obj2);
		System.out.println("Object 1");
		obj1.printList(obj1);
		System.out.println("Object 2");
		obj2.printList(obj2);
		boolean cmp=obj1.palind(obj1,obj2);
		System.out.println(cmp);

	}
}




