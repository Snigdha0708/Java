import java.util.*;
 class LLo
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
public static LLo insert(LLo l,int d)
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
public static LLo del(LLo l,int p,int c)
{
Node t=l.head;
int a=0;
Node ptr=l.head;
if((p<1)||(p>=c))
	return l;
else if(p==1)
{
	while(ptr.next!=null)
	{
		
	}
}
else
{
while(a!=p-2)
	{
		t=t.next;
	a++;
}
Node n=t.next.next;
      t.next=n;
      return l;
  }}
public static void printList(LLo l)
{
	Node ptr1=l.head;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
public static int count(LLo l)
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
}
class k
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int d=30;
		LLo obj1=new LLo();
		int a;
		//LL obj2=new LL();
		obj1.insert(obj1,d);
        obj1.insert(obj1,50);
        obj1.insert(obj1,40);
        obj1.insert(obj1,60);
        //obj1.insert(obj1,70);
		
		a=obj1.count(obj1);
		int k=s.nextInt();
		obj1.printList(obj1);
        int p=a-k+1;
        obj1.del(obj1,p,a);
        obj1.printList(obj1);
		//obj2.printList(obj2);
	}
}




