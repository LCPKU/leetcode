package leetcode;

public class leetcode_73 {
    public void setZeroes(int[][] matrix) {
    	int countrow=0;//���浱ǰλ��Ϊ0ʱ������
    	int countcol=0;//���浱ǰλ��Ϊ0����
    	int row= matrix.length;
    	int col=matrix[0].length;
    	int zerosrow[] = new int[1000];//���浱ǰ����0ʱ�����飨�˴���ʵ��Ϊhashset����
    	int zeroscol[] = new int[1000];//ͬ
    	for(int i=0;i<row;i++)//��0
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
    	for(int i=0;i<countrow;i++)//����0������Ϊ0
    	{
    		int zeronum=zerosrow[i];
    		for(int j=0;j<col;j++)
    		{
    			matrix[zeronum][j]=0;
    		}
    	}
    	for(int i=0;i<countrow;i++)//����0������Ϊ0
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

