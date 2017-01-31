package leetcode;

public class Bitwise_AND_of_Numbers_Range_201 {
	/*
	 * 这个题挺简单的
	 * 我本以为是首先将10进制转换为2进制，然后对于返回的数进行比较
	 * 后来百度发现了这个种方法，逐步进行移位便可，但是这种方法就是找到相同的位就停止了啊。。。
	 */
    public int rangeBitwiseAnd(int m, int n) {
        int bit = 0;  
        while(m!=n) {  
            m>>=1;  
            n>>=1;  
            bit++;  
        }  
        return m<<bit;
    }
    public String inttobinary(int n)
    {
    	 boolean minus=false;
    	 String result= "";
    	 if(n < 0){
             minus = true;
             n = Math.abs(n + 1);
         }
         while(true){
             int remainder = (!minus && n % 2 == 0) || (minus && n % 2 == 1) ? 0 : 1;

             //将余数保存在结果中
             result = remainder + result;
             n /= 2;

             if(n == 0){
                 break;
             }
         }
         //判断是否为负数，如果是负数，那么前面所有位补1
         if(minus){
             n = result.length();
             for(int i = 1; i <= 32 - n; i++){
                 result = 1 + result;
             }
         }
         return result;
    }
    public static void main(String[] args) {
    	Bitwise_AND_of_Numbers_Range_201 l = new Bitwise_AND_of_Numbers_Range_201();
    	int m=6;
    	int n=58;
    	int a =l.rangeBitwiseAnd(m, n);
    	System.out.println(a);
	}
}
