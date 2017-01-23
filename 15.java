import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {
    if (nums == null || nums.length < 3) return ret; 
   // List<List<Integer>> ret = new ArrayList<List<Integer>>();//¶şÎ¬LIST
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++)
    {
    	//int begin=0;
    	//int end=nums.length-1;
    	if(i>0&&nums[i]==nums[i-1])
    	{
    		continue;
    	}
    	find(nums,i,i+1,nums.length-1);
    }
    return ret;
    }
    public void find(int[] nums, int target, int begin, int end)
    {
    	
    	int b=begin;
    	int e=end;
    	while(b<e)
    	{
    		List<Integer> ans= new ArrayList<Integer>();
    	if((nums[target]+nums[b]+nums[e])==0)
    	{
    		ans.add(nums[target]);
    		ans.add(nums[b]);
    		ans.add(nums[e]);
    		ret.add(ans);
    		while(b<e&&nums[b]==nums[b+1])
    		{
    			b++;
    		}
    		while(b<e&&nums[e]==nums[e-1])
    		{
    			e--;
    		}
    		b++;
    		e--;
    	}
    	else if((nums[target]+nums[b]+nums[e])<0)
    	{
    		b++;
    	}
    	else
    	{
    		e--;
    	}
    }
    }
    public static void main(String [] args)
    {
    	Solution s=new Solution();
    	int [] nums={-1,0,1,2,-1,4};
    	List<List<Integer>> caf = new ArrayList<List<Integer>>();
    	caf=s.threeSum(nums);
    	System.out.println(caf);	
    }
}
