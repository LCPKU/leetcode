package leetcode;

public class Add_Digits_258 {
	//我很无耻的每道题都参考了网上啊
	//这样会不会根本就没有用啊
	//这道题其实不难，主要在于就是把字符拆开，累加，直到当前数字小于10 便可
	//我现在都是看看网上，然后自己再写啊
	//我自己写的往往都有问题
	
    public int addDigits(int num) {
         while(num>10)
         {
        	 num=getnext(num);
         }
         return num;
    }
    public int getnext(int num)
    {
    	String a =String.valueOf(num);
    	int sum=0;
    	for(char ch:a.toCharArray())
    	{
    		//ARSIC码，这样累加比每轮除10累加方便，get一个新点，下次自己写的时候会注意用这种方法
    		sum=sum+(ch-'0');
    	}
    	return sum;
    }
    public static void main(String [] args)
    {
    	Add_Digits_258 l= new Add_Digits_258();
    	int a= l.addDigits(275);
    	System.out.println(a);
    	
    }
}
