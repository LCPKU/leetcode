import java.util.HashMap;
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
        	return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();
       
        for(int i=0;i<sarray.length;i++)
        {
        	if(map.containsKey(sarray[i]))
        	{
   
        		map.put(sarray[i], map.get(sarray[i]) + 1);
        	}
        	else
        	{
        		map.put(sarray[i], 1);
        	}
        }
        for(int j=0;j<tarray.length;j++)
        {
        	if(map.containsKey(tarray[j]))
        	{   int n=map.get(tarray[j]);

        		map.put(tarray[j], map.get(tarray[j]) -1);
        		if(map.get(tarray[j])==0)
        		{
        			map.remove(tarray[j]);
        		}
        	}
        	else
        	{
        		return false;
        	}
        }
        return true;
    }
    public static void main(String[] args)
    {
    	Solution s=new Solution();
    	String w="baaacc";
    	String t="abcaaa";
    	boolean f=s.isAnagram(w, t);
    	System.out.println(f);
    	
    }
}
