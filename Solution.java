
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().length()==0||s.length()==0)
        {
        	return 0;
        }
        String[] ss=s.trim().split(" ");
        int len=ss.length;
        return ss[len-1].length();
    }
    public static void main(String[] args)
    {
    	String s="hello world";
    	Solution w=new Solution();
    	int a=w.lengthOfLastWord(s);
    	System.out.println(a);
    }
}
