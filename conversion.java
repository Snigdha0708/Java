import java.util.*;
class conversion
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        String str=s.next();
        String f="";
        char ar[]=str.toCharArray();
        String a=bal(ar,f);
        System.out.println(a);
	}
	static int check(char a)
	{
		if(a=='^')
			return 3;
		else if(a=='*'||a=='/')
			return 2;
		else if(a=='+'||a=='-')
			return 1;
		return 0;
	}
	static String bal(char ar[],String f)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]>='0'&&ar[i]<='9')||(ar[i]>='a'&&ar[i]<='z')||(ar[i]>='A'&&ar[i]<='Z'))
				f+=ar[i];	
				else
				{
                     if(st.isEmpty())
                     {
                     	st.push(ar[i]);
                     } 
                     else
                     {
                     	if(check(st.peek())<=ar[i])
                     		{f+=st.pop();
                     			st.push(ar[i]);
                     }
                     else
                     {
                     	st.push(ar[i]);
                     }
                 }
				}}	
				while(!st.isEmpty())
				{
					f+=st.pop();
				}
				return f;
	}
}