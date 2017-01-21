package leetcode;
import java.util.Arrays;
import java.util.Vector;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class leetcode_349 {
    public int[] intersection(int[] nums1, int[] nums2) {  
        if(nums1.length==0||nums2.length==0)  
            return new int[0];  
        Set<Integer> result = new HashSet();  
        Set<Integer> set1 = new HashSet();  
        for(int i=0;i<nums1.length;i++){  
            set1.add(nums1[i]);  
        }  
        for(int i=0;i<nums2.length;i++){  
            if(set1.contains(nums2[i]))  
                result.add(nums2[i]);  
        }  
        int[] res = new int[result.size()];  
        int i=0;  
        Iterator iter = result.iterator();  
        while(iter.hasNext()){  
            res[i++]=(int)iter.next();  
        }  
        return res;  
    }
    public static void main(String [] args)
    {
    	leetcode_349 l = new leetcode_349();
    	int []nums1={1,2,2,2,2,2,2,2,2,2,21,2,3,3,3,1};
    	int []nums2={2,3,3,3,1};
    	int [] newarray=l.intersection(nums1,nums2);
    	int count=0;
    	while(count<newarray.length)
    	{
    		System.out.println(newarray[count]);
    		count++;
    	}
    }
}
