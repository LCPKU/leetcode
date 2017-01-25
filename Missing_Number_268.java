package leetcode;

public class Missing_Number_268 {
    public int missingNumber(int[] nums) {
    	if(nums.length==1&&nums[0]==1)
    	{
    		return 0;
    	}
    	if(nums.length==1&&nums[0]==0)
    	{
    		return 1;
    	}
       // int max= FindMax(nums);
    	int flag=0;
    	for(int i=0;i<nums.length;i++)
    	{
            if(nums[i]==0)
    		{
            	//System.out.println("flag"+flag);
    			flag=1;
    		}
    	}
    	if(flag==0)
    	{
    		return 0;
    	}
        int min=FindMin(nums);
        System.out.println("最小值为"+min);
        System.out.println("长度为"+nums.length);
        int sum=(nums.length+1)*min+nums.length*(nums.length+1)/2;
        System.out.println("sum 为"+sum);
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
        	totalsum=totalsum+nums[i];
        }
        System.out.println("totalsum 为"+totalsum);
        if(totalsum==sum)
        {
        	return FindMax(nums)+1;
        }
        else{
        int a =sum-totalsum;
        return a;
        }
    }
    public int FindMax(int [] nums)
    {
    	int max=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]>max)
    		{
    			max=nums[i];
    		}
    	}
    	return max;
    }
    public int FindMin(int [] nums)
    {
    	int min=0xFFFFFFF;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]<min)
    		{
    			min=nums[i];
    		}
    	}
    	return min;
    }
    public static void main(String[] args) {
    	Missing_Number_268 l = new Missing_Number_268();
    	int [] nums={0,1};
    	int a= l.missingNumber(nums);
    	System.out.println(a);
	}
}
