import java.util.*;
class Stack1
{
	static Node top=null;
	static  class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
public static Stack1 push(Stack1 l,int d)
{
	Node newnode=new Node(d);
	newnode.data=d;
	newnode.next=l.top;
	l.top=newnode;
	return l;
}
public static Stack1 pop(Stack1 l)
{
	if(top == null) {  
            System.out.println("Stack is empty");  
            return l;  
        }  
        else {  
        Node temp = top; 
        top = top.next; 
}
return l;
}
public static void display(Stack1 l)
{
	Node ptr1=l.top;
	while (ptr1!=null) {
		System.out.println(ptr1.data);
		ptr1=ptr1.next;
	}

}
}
class sl
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Stack1 st=new Stack1();
		System.out.println("Enter no of nodes");
       while(s.hasNext())
       {
       	int choice=s.nextInt();
		if(choice==1)
		{
			int n=s.nextInt();
			st.push(st,n);
		}
		if(choice==2)
		{
			st.pop(st);
		}
		else
		{
         st.display(st);
		}
	}
	}
}
