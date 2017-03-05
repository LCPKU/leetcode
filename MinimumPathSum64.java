package leetcode;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid)
    {    
    	int  m= grid.length;
    	int n=grid[0].length;
    	if(m==0)
    	{
    		return 0;
    	}
         int [][]flag=new int[m][n];
         for(int i=0;i<m;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 flag[i][j]=0;
        		// System.out.println(flag[i][j]);
        	 }
         }
         flag[m-1][n-1]=grid[m-1][n-1];
         System.out.println("当前位置为"+"行"+(m-1)+"列"+(n-1)+"值"+flag[m-1][n-1]);
         if(n==1&&m==1)
         {
        	 return grid[0][0];
         }
   		 for(int j=n-2;j>=0;j--)
		 {
			 flag[m-1][j]=flag[m-1][j+1]+grid[m-1][j];
			 System.out.println("当前位置为"+"行"+(m-1)+"列"+j+"值"+flag[m-1][j]);
		 }
   		 for(int j=m-2;j>=0;j--)
		 {
			 flag[j][n-1]=flag[j+1][n-1]+grid[j][n-1];
			 System.out.println("当前位置为"+"行"+(j+1)+"列"+(n-1)+"值"+flag[j+1][n-1]);
			 System.out.println("当前位置为"+"行"+j+"列"+(n-1)+"值"+flag[j][n-1]);
		 }
         for(int i=m-2;i>=0;i--)
         {
        	 for(int j=n-2;j>=0;j--)
        	 {
        		 if((grid[i][j]+flag[i+1][j])>(grid[i][j]+flag[i][j+1]))
        		 {
        			 flag[i][j]=grid[i][j]+flag[i][j+1];
        		 }
        		 else
        		 {
        			 flag[i][j]=grid[i][j]+flag[i+1][j];
        		 }
        	 }
         }
         for(int i=0;i<m;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 System.out.println(flag[i][j]);
        	 }
         }
         return flag[0][0];
    }
    public static void main(String[] args) {
    	MinimumPathSum64 l= new MinimumPathSum64();
    	
    	int [][] grid={{0}};
    	int a =l.minPathSum(grid);
    	System.out.println(a);
    	
	}
}
