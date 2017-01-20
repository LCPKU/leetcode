package leetcode;

public class leetcode_73 {
    public void setZeroes(int[][] matrix) {
    	int countrow=0;//保存当前位置为0时的行数
    	int countcol=0;//保存当前位置为0列数
    	int row= matrix.length;
    	int col=matrix[0].length;
    	int zerosrow[] = new int[1000];//保存当前行有0时的数组（此处其实改为hashset更好
    	int zeroscol[] = new int[1000];//同
    	for(int i=0;i<row;i++)//找0
    	{
    		for(int j=0;j<col;j++)
    		{
    			if(matrix[i][j]==0)
    			{
    				zerosrow[countrow]=i;
    				zeroscol[countcol]=j;
    				countrow++;
    				countcol++;
    			}
    		}
    	}
    	for(int i=0;i<countrow;i++)
    	{
    		System.out.println(zerosrow[i]);
    	}
    	for(int i=0;i<countcol;i++)
    	{
    		System.out.println(zeroscol[i]);
    	}
    	for(int i=0;i<countrow;i++)//将有0的行置为0
    	{
    		int zeronum=zerosrow[i];
    		for(int j=0;j<col;j++)
    		{
    			matrix[zeronum][j]=0;
    		}
    	}
    	for(int i=0;i<countrow;i++)//将有0的列置为0
    	{
    		int zeronum=zeroscol[i];
    		for(int j=0;j<row;j++)
    		{
    			matrix[j][zeronum]=0;
    		}
    	}
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			System.out.println(matrix[i][j]);
    		}
    	}
    	
    }
    public static void main(String [] args)
    {
    	leetcode_73 l=new leetcode_73();
    	int [][]s={{0,0,0,4},{2,1,0,6},{4,5,0,7}};
    	l.setZeroes(s);
    }
}

