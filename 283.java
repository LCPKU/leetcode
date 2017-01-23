
public class Solution {
    public void moveZeroes(int[] nums) {
    	int i=0;
    	int num=0;
    	for(int w=0;w<nums.length;w++)
    	{
    		if(nums[w]==0)
    		{
    			num++;
    		}
    	}
        while(true)
        {
        	if(nums[i]==0)
        	{
        		for(int j=i;j<nums.length-1;j++)
        		{
        			nums[j]=nums[j+1];
        		}
        		nums[nums.length-1]=0;
        	}
        	else
        	{
        		i++;
        	}
        	if(i==(nums.length-num))
        	{
        		break;
        	}
        }
    }
    public static void main(String [] args)
    {
    	Solution s=new Solution();
    	int [] nums={2,3,1,0,3,0,0,0,3,6,8,1,0,0};
    	s.moveZeroes(nums);
    	for(int i=0;i<nums.length;i++)
    	{
    	System.out.println(nums[i]);
    	}
    }
}
