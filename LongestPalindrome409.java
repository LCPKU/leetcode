package leetcode;
import java.util.HashMap;
/*
 * ������ұ�������hashmap����
 * �о����ڸ���
 * Ȼ���Ұٶ���һ��
 * ���ʹ����ASCII��ķ�ʽ
 * ���Ϊż��������������2�����ϣ�����2
 * �����ǰ����С��ԭ������
 * ˵��һ����������
 * ���ֱ�Ӽ�1
 */ 
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
      int [] str = new int[123];
       for(int i=0;i<s.length();i++)
       {
    	   str[s.charAt(i)]++;
       }
       int sum=0;
       for(int i=65;i<=122;i++)
       {
    	   sum=sum+str[i]/2;
       }
       sum=sum*2;
       if(sum<s.length())
       {
    	   sum=sum+1;
       }
       return sum;   
    }
    public static void main(String[] args) {
    	LongestPalindrome409 l=new LongestPalindrome409();
    	String s="zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
    	int w=l.longestPalindrome(s);
    	System.out.println(w);
	}
}
