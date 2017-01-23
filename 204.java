
public class Solution {
    public int countPrimes(int n) {
    	if(n<=2)
    	{
    		return 0;
    	}
    	int count=0;
    	boolean[] mask=new boolean[n+1];
    	for(int i=0;i<=n;i++)
    	{
    		mask[i]=true;
    	}
        for(int i=2;i<n;i++)
        {
        	for(int j=2;j*i<=n;j++)
        	{
        		mask[i*j]=false;
        	}
        }
        for(int i=2;i<n;i++)
        {
        	if(mask[i])
        	{
        		count++;
        	}
        }
        return count;

    }
    public static void main(String[] args){
    	Solution s=new Solution();
    	int n=5;
    	int num=s.countPrimes(n);
    	System.out.println(num);
    }
}
