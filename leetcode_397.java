package leetcode;
public class leetcode_397 {
	//��һ���Լ�д�ĵݹ����������⣬�����ο������ϵĵݹ鷽�� 
	//�޸ĺ�����Ȼ�����⣬�����Ȼ���ֲο���һ�£���������һ�¡�
	//���ڵݹ����Ĳ�͸��
	//���Լ�д���Ǹ���������WHileѭ������һ��ʼ���Ǵ��ˣ���ȫû�취����ѭ��
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
