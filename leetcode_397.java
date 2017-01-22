package leetcode;
public class leetcode_397 {
	//第一次自己写的递归总是有问题，后来参考了网上的递归方法 
	//修改后发现仍然有问题，溢出，然后又参考了一下，函数改了一下。
	//对于递归理解的不透彻
	//我自己写的那个递推用了WHile循环，从一开始就是错了，完全没办法跳出循环
	//
	public int integerReplacement(int n)
	{
		return (int)longReplacement(n);
	}
    public long longReplacement(int n) {
    	if(n==1)
    	{
    		return 0;
    	}
    	if(n%2==0)
    	{
   			return  1 + longReplacement(n / 2);
    	}
    	else
    	{
            long a= Math.min(1+longReplacement(n+1),1+longReplacement(n-1));
            return a;
    	}
    }
    public static void main(String [] args)
    {
    	leetcode_397 l=new leetcode_397();
    	int n=7;
    	int w=l.integerReplacement(3);
    	System.out.println(w);
    }
}
