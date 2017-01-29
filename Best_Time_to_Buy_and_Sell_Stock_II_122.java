package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public int maxProfit(int[] prices) 
    {
    	if(prices.length==0)
    	{
    		return 0;
    	}
    	if(prices.length==1)
    	{
    		return 0;
    	}
    	if(prices.length==2)
    	{
    		if(prices[1]-prices[0]>=0)
    		{
    			return prices[1]-prices[0];
    		}
    		else
    		{
    			return 0;
    		}
    	}

    	int sum=0;

    	for(int i=0;i<prices.length-1;i++)
    	{
             if(prices[i+1]>prices[i])
             {
            	 sum=sum+prices[i+1]-prices[i];
             }
    	}
    	return sum;
        
    }
    public static void main(String[] args) {
    	Best_Time_to_Buy_and_Sell_Stock_II_122 l=new Best_Time_to_Buy_and_Sell_Stock_II_122();
    	int [] prices= {2,1,56,0,65,41};
    	int a =l.maxProfit(prices);
    	System.out.println(a);
	}
}
