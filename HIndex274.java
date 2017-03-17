package leetcode;
import java.util.Arrays;
public class HIndex274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0;
        for(int i=citations.length-1;i>=0;i--)
        {
        	if(citations[i]>=count)
        	{
        		count++;
        	}
        	else
        	{
        		break;
        	}
        }
        return count;
        
    }
    public static void main(String[] args) {
    	HIndex274 l=new HIndex274();
    	int [] citations={3, 0, 6, 1, 5};
    	int a=l.hIndex(citations);
    	System.out.println(a);
	}
}
