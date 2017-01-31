package leetcode;
import java.util.List;
import java.util.ArrayList;
public class Summary_Ranges_228 {
	/*
	 * 这个代码我写的很冗余
	 */
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length==0)
        {
        	return list;
        }
        int first= nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
              if(nums[i+1]!=nums[i]+1)
              {
            	  if(first!=nums[i])
            	  {
            		  list.add(first+"->"+nums[i]);
            	  }
            	  else
            	  {
            		  String s = Integer.toString(nums[i]);
            		  list.add(s);
            	  }
            	  first=nums[i+1];
              }
        }
        /*
         * 接下来这部分是因为我总是加不上最后的那个部分，不知道为什么，我在上面判断的时候肯定是有问题，我就这么改了一下
         * 也AC了
         */
        if(nums[nums.length-1]==first)
        {
  		  String s = Integer.toString(nums[nums.length-1]);
  		  list.add(s);
        }
        else if(nums[nums.length-1]!=first)
        {
        	list.add(first+"->"+nums[nums.length-1]);
        }
        return list;
    }
    public static void main(String[] args) {
    	Summary_Ranges_228 l= new Summary_Ranges_228();
    	int [] nums={1};
    	List<String> list2 = l.summaryRanges(nums);
    	System.out.println(list2);
	}
}
