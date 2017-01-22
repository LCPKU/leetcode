
public class Solution {
	 public int majorityElement(int[] nums){ {
		 if(nums.length==0)
		 {
			 return 0;
		 }
		 if(nums.length==1)
		 {
			 return nums[0];
		 }
	   for(int i=0;i<nums.length;i++)
	   {
		   for(int j=i+1;j<nums.length;j++)
		   {
			   if(nums[j]>nums[i])
			   {
				   int temp=nums[i];
				   nums[i]=nums[j];
				   nums[j]=temp;
			   }
		   }
	   }
	   int half=(nums.length)/2;
	   int count=0;
	   int m=0;
	   for(int i=0;i<nums.length-1&&count<half;i++)
	   {
		   if(nums[i+1]==nums[i])
		   {
			   m=nums[i];
			   count++;
		   }
		   else
		   {
			   count=0;
			   //m=0;
		   }
	   }
	   return m;
	  }
	 public static void main(String[] args)
	 {
		 int[] a={2,2,5,3,4,6,3,3,3,3,3};
		 Solution s=new Solution();
		 int w=s.majorityElement(a);
		 System.out.println(w);
	 }

}
