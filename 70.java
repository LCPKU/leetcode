
public class Solution {
    public int climbStairs(int n) {
    	if(n==1||n==2||n==0)
    	{
    		return n;
    	}
    	int [] r=new int[n+1];
    	r[1]=1;
    	r[2]=2;
    	for(int i=3;i<=n;i++)
    	{
    		r[i]=r[i-1]+r[i-2];
    	}
    	return r[n];
    }
    public static void main(String [] args)
    {4£»£»
    	Solution s=new Solution();
    	int n=6;
    	int w=s.climbStairs(n);
    	System.out.println(w);
    }
}
