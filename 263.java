
public class Solution {
    public boolean isUgly(int num) {
    	if(num<=0)
    	{
    		return false;
    	}
    	if(num==1)
    	{
    		return true;
    	}
    	while(num%2==0)
    	{
    		num=num/2;
    		if(num==3||num==5||num==2||num==1)
    		{
    			return true;
    		}
   		}
   		while(num%3==0)
    	{
    		num=num/3;
    		if(num==3||num==5||num==2||num==1)
    		{
    			return true;
    		}
    	}
    	while(num%5==0)
   		{
   			num=num/5;
   			if(num==3||num==5||num==2||num==1)
   			{
   				return true;    		
   			}
    	}
    	return false;
    }
    public static void main(String[] agrs)
    {
    	Solution s=new Solution();
    	int num=2;
    	boolean w=s.isUgly(num);
    	System.out.println(w);
    	//System.out.println("jfsjkfasdkfasnd");
    }
}
