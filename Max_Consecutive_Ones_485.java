package leetcode;

public class Max_Consecutive_Ones_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]==1)
        	{
                current++;
                System.out.println(current);
        	}
        	if(current>max)
    		{
    			max=current;
    		}
        	else if (nums[i]==0)
        	{
        		current=0;
        	}
        }
        return max;
    }
    public static void main(String[] args) {
    	Max_Consecutive_Ones_485 l = new Max_Consecutive_Ones_485();
    	int [] nums= {1,0,1,1,0,1};
    	int a = l.findMaxConsecutiveOnes(nums);
    	System.out.println(a);
    	
	}
}
