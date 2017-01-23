import java.util.HashMap;
import java.util.HashSet;
public class Solution {
    public boolean isIsomorphic(String s, String t) {
    	if(s.length()!=t.length())
    	{
    		return false;
    	}
    	if(s.length()==0)
    	{
    		return true;
    	}
    	if(s.length()==1)
    	{
    		return true;
    	}
        char [] sarray=s.toCharArray();
        char [] tarray=t.toCharArray();
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        map.put(sarray[0], tarray[0]);
        set.add(tarray[0]);
        for(int i=1;i<sarray.length;i++)
        {
        	if(map.containsKey(sarray[i]))
        	{
        		if( map.get(sarray[i])!=tarray[i])
        		{
        			return false;
        		}
        	}
        	else
        	{
        		if(set.contains(tarray[i]))
        		{ 
        			return false; 
        		}
        		else
        		{
        			map.put(sarray[i],tarray[i]);
        			set.add(tarray[i]);
        		}
        	}
        }
        return true;

    }
    public static void main(String [] args)
    {
    	Solution s=new Solution();
    	String s1="";
    	String t1="";
    	boolean w=s.isIsomorphic(s1, t1);
    	System.out.println(w);
    }
}
