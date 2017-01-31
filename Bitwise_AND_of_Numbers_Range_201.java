package leetcode;

public class Bitwise_AND_of_Numbers_Range_201 {
	/*
	 * �����ͦ�򵥵�
	 * �ұ���Ϊ�����Ƚ�10����ת��Ϊ2���ƣ�Ȼ����ڷ��ص������бȽ�
	 * �����ٶȷ���������ַ������𲽽�����λ��ɣ��������ַ��������ҵ���ͬ��λ��ֹͣ�˰�������
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

             //�����������ڽ����
             result = remainder + result;
             n /= 2;

             if(n == 0){
                 break;
             }
         }
         //�ж��Ƿ�Ϊ����������Ǹ�������ôǰ������λ��1
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
