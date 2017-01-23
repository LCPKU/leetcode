
public class Solution {
     public int RemoveDuplicates(int a[])
	{
      int n=a.length;
	  if(n==0)
	  {
		  return 0;
	  }
	  int j=0;
	  for(int i=1;i<n;i++)
	  {
		  if(a[j]!=a[i])
		  {
			  a[++j]=a[i];
		  }
	  }
	  return j+1;  
	}
     public static void main(String[] args)
     {
    	 int[] a={1,1,2};
    	 Solution s=new Solution();
    	 int u=s.RemoveDuplicates(a);
    	 System.out.println(u);
     }
}
