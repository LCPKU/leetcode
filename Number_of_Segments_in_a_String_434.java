package leetcode;

public class Number_of_Segments_in_a_String_434 {
    public int countSegments(String s) {
    	s=s.trim();
    	String a[] = s.split("\\s+"); 
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.println(a[i]);
    	}
    	return a.length;
    }
    public static void main(String[] args) {
    	Number_of_Segments_in_a_String_434 l = new Number_of_Segments_in_a_String_434();
    	String s="     goo         fasfg";
    	int a= l.countSegments(s);
    	System.out.println(a);
	}
}
