package leetcode;
import java.util.HashMap;
/*
 * 这个题我本来是用hashmap做的
 * 感觉过于复杂
 * 然后我百度了一下
 * 这个使用了ASCII码的方式
 * 如果为偶数或者奇数都除2，加上，最后乘2
 * 如果当前长度小于原串长度
 * 说明一定存在奇数
 * 最后直接加1
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
