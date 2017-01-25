package leetcode;

public class Increasing_Triplet_Subsequence_334 {
    public boolean increasingTriplet(int[] nums) 
    {
         if(nums.length<3)
    	 {
    		 return false;
    	 }
         int l=nums[0];
         int m=0x7fffffff;
         for(int i=1;i<nums.length;i++)
         {
        	 int a=nums[i];
        	 if(a<=l)//找到小于当前的nums[i]的最小的值，标记了L
        	 {
        		 l=a;
        	 }
        	 else if(a<m)//如果当前a小于m，并且a>l,这时候令a为当前的中间值
        	 {
        		 m=a;
        	 }
        	 else if (a>m)//如果此时的a已经大于中间值m了，表明已经存在3个连续，直接返回TRUE
        	 {
        		 return true;
        	 } 
         }
         return false;
    }
}
