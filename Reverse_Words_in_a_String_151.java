package leetcode;
import java.util.Stack;
public class Reverse_Words_in_a_String_151 {
	//����⿴����ͦ�򵥵ģ������һ���д�˺ܾã���Ҫ������������split(" ")ʱ���õ���split(" ")������
	//���������ô��ӡ���ַ��м䶼�пո�Ȼ���Ұٶ���һ�����ȥ���ո�
	//trim ����β��
	//ʹ��split("\\s+")    
	//   \\s��ʾ   �ո�,�س�,���еȿհ׷�,  ʹ������Ϳ���ȥ���ַ��еĿո�  
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
