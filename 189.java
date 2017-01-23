
public class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
    	rot(nums,0,nums.length-k-1);
    	rot(nums,nums.length-k,nums.length-1);
    	rot(nums,0,nums.length-1);
    	
    }
    public void rot(int[] array,int start,int end)
    {
    	int length=end-start+1;
    	for(int i=0;i<length/2;i++)
    	{
    		int temp=array[start+i];
    		array[start+i]=array[end-i];
    		array[end-i]=temp;
    	}
    }
    public static void main(String[] args)
    {
    	Solution s=new Solution();
    	int[] nums={-1};
    	int k=2;
    	s.rotate(nums, k);
    	for(int i=0;i<nums.length;i++)
    	{
    		System.out.print(nums[i]);
    	}
    }
}