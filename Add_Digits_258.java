package leetcode;

public class Add_Digits_258 {
	//�Һ��޳ܵ�ÿ���ⶼ�ο������ϰ�
	//�����᲻�������û���ð�
	//�������ʵ���ѣ���Ҫ���ھ��ǰ��ַ��𿪣��ۼӣ�ֱ����ǰ����С��10 ���
	//�����ڶ��ǿ������ϣ�Ȼ���Լ���д��
	//���Լ�д��������������
	
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
    		//ARSIC�룬�����ۼӱ�ÿ�ֳ�10�ۼӷ��㣬getһ���µ㣬�´��Լ�д��ʱ���ע�������ַ���
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
