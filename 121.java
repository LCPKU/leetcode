public class Solution {
public int maxProfit(int[] prices) {
    	int max=0;
        for(int i=prices.length-1;i>0;i--)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(prices[i]>prices[j])
        		{
        			int chaju=prices[i]-prices[j];
        			if(chaju>max)
        			{
        				max=chaju;
        			}
        		}
        	}
        }
        return max;
    }
}