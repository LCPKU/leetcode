
public class Solution {
    public String intToRoman(int num) {
        String str="";
        int count=0;
        String [] str1={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        while(num!=0)
        {
        	if(num>=value[count])
        	{
        		num=num-value[count];
        		str=str+str1[count];
        	}
        	else
        	{
        		count++;
        	}
        }
        return str;
    }
    public static void main(String [] args)
    {
    	Solution s=new Solution();
    	int n=456;
    	String w=s.intToRoman(n);
    	System.out.print(w);
    }
}
