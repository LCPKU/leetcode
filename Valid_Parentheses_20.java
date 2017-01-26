package leetcode;
import java.util.Stack;
public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<Character>();
        char [] w=s.toCharArray();
        int flag=0;
        if(w.length==1||w[0]==')'||w[0]=='}'||w[0]==']')
        {
        	return false;
        }
        for(int i=0;i<w.length;i++)
        {
        	if(w[i]=='('||w[i]=='{'||w[i]=='[')
        	{
        		a.add(w[i]);
        		System.out.println(w[i]);
        	}
        	else
        	{
        		if(a.isEmpty())
        		{
        			flag=1;
        			return false;
        		}
        		char l=a.pop();
        		if(l=='('&&w[i]==')')
        		{
        			flag=0;
        		}
        		else if(l=='{'&&w[i]=='}')
        		{
        			flag=0;
        		}
        		else if(l=='['&&w[i]==']')
        		{
        			flag=0;
        		}

        		else
        		{
        			System.out.println("l"+l+"      "+"w[i]"+w[i]);
        			flag=1;
        			return false;
        		}
        	}
        }
        if(flag==0&&a.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
    public static void main(String[] args) {
    	Valid_Parentheses_20 l= new Valid_Parentheses_20();
    	String s= "((";
    	boolean a=l.isValid(s);
    	System.out.println(a);
	}
}
