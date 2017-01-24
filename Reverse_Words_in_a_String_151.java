package leetcode;
import java.util.Stack;
public class Reverse_Words_in_a_String_151 {
	//这个题看起来挺简单的，但是我还是写了很久，主要问题在于我在split(" ")时，用的是split(" ")方法，
	//结果无论怎么打印，字符中间都有空格，然后我百度了一下如何去除空格
	//trim 是首尾，
	//使用split("\\s+")    
	//   \\s表示   空格,回车,换行等空白符,  使用这个就可以去除字符中的空格  
    public String reverseWords(String s) {
    	s=s.trim();
    	if(s.length()==0)
    	{
    		return "";
    	}
    	String[] sa = s.split("\\s+"); 
        for(int i=sa.length-1;i>=0;i--)
        {
        	if(sa[i]!=" ")
        	{
        	    System.out.println(sa[i]);
        	}
        }
        if(sa.length==0)
        {
        	return "";
        }
        if(sa.length==1)
        {
        	return sa[0];
        }
        else
        {
            String a= new String();
            for(int i=sa.length-1;i>=1;i--)
            {
            	if(sa[i]!=" ")
            	{
        	     a=a+sa[i]+" ";
            	}
            }
            a=a+sa[0];
            return a;
        }
    }
    public static void main(String[] args) {
    	Reverse_Words_in_a_String_151 l = new Reverse_Words_in_a_String_151();
    	String s= "         1   b a a a  a     a  ";
    	String a=l.reverseWords(s);
    	System.out.println(a);
	}
}
