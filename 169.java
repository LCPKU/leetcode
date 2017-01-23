
public class Solution {
	public boolean isAlpa(char c)
	{
		if(c<='z'&&c>='a')
		{
			return true;
		}
		else if(c>='0'&&c<='9')
		{
			return true;
		}
		return false;
	}
    public boolean isPalindrome(String s) {
     String s1=s.toLowerCase();
     if(s1.length()==0)
     {
    	 return true;
     }
     char [] sarray=s1.toCharArray();
     int longth=sarray.length;
     int start=0;
     int end=longth-1;
     while(true)
     {
        while(start<longth&&!isAlpa(sarray[start]))
        {
        	start++;
        }
        while(end>=0&&!isAlpa(sarray[end]))
        {
        	end--;
        }
        if(start<end)
        {
              if(sarray[start]!=sarray[end])
              {
        	       return false;
              }
        }
        if(start>=end)
        {
        	return true;
        }
        start++;
        end--;
     }
     //return true;
     
    }
    public static void main(String [] args)
    {
    	Solution a=new Solution();
    	String s="";
    	boolean w=a.isPalindrome(s);
    	System.out.println(w);
    }
    
}
