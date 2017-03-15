package leetcode;
//import java.util.Math;
public class AdditiveNumber306 {
    public boolean isAdditiveNumber(String num) {
        if(num == null || num.length() == 0) {
            return false;
        }
    	for(int i=0;i<num.length()/2;i++)
    	{
    		for(int j=i+1;Math.max(i,j)<num.length()-1;j++)
    		{
    			String sub1=num.substring(0,i);
    			String sub2=num.substring(i,j);
    			if(isAdditive(sub1,sub2,num.substring(j)))
    			{
    				return true;
    			}
    		}
    	}
        return false;
    }
    public  boolean isAdditive(String sub1,String sub2,String num)
    {
    	if(num.length()==0)
    	{
    		return true;
    	}
    	if(sub1.length()>1&&sub1.charAt(0)=='0'||sub2.length()>1&&sub2.charAt(0)=='0')
    	{
    		return false;
    	}
    	String sum=getSum(sub1,sub2);
    	if(sum.length()>num.length()||!sum.equals(num.substring(0, sum.length())))
    	{
    		return false;
    	}
    	else
    	{
    		return isAdditive(sub2,sum,num.substring(sum.length()));
    	}
    }
    public String getSum(String sub1,String sub2)
    {
    	StringBuilder sb= new StringBuilder();
    	int index1=sub1.length()-1;
    	int index2=sub2.length()-1;
    	int carry=0;
    	int newDigit=0;
    	while(index1>=0||index2>=0)
    	{
    		int digit1=index1>0 ? sub1.charAt(index1)-'0':0;
    		int digit2=index2>0 ? sub2.charAt(index2)-'0':0;
    		newDigit = (digit1+digit2+carry)%10;
    		sb.insert(0, newDigit);
    		carry=(digit1+digit2+carry)>0?1:0;
    		index1--;
    		index2--;	
    	}
    	if(carry==1)
    	{
    		sb.insert(0, '1');
    	}
    	return sb.toString();
    }
    public static void main(String[] args) {
    	AdditiveNumber306 l =new AdditiveNumber306();
    	String num= "12345678";
    	boolean flag=l.isAdditiveNumber(num);
    	System.out.println(flag);
	}
}
