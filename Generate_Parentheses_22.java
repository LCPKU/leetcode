package leetcode;
import java.util.List;
import java.util.ArrayList;
/*
 * ����⻹�ǲο������ϣ���������Ҳ����һ���⣬241��Ҳ���������⣬�Ҹ�����û�����������ϵĴ�Ҳû����
 * ����⻹�ǲο�������
 * �����΢�����˻���һ����
 * �Ҹտ�ʼ���ʱ��
 * ���������һ��һ�ԵĲ��룬�����ҷ����ҵ��뷨���Լ���ʵ�ֲ���
 * �о�������
 * Ȼ�󿴵������ַ�������ʵ���ǻ��ݣ�����������������
 * leftnum��ʾ��ǰ��ʣ�µ�����������rightnum��ʾ��ǰ��ʣ�µ���������
 * �����ʣ��������С����ʣ����������������ǰ�Ѿ������������ˣ����ܵݹ���
 * �������ʣ����������Ϊ0
 * �Ͱѵ�ǰ����ӽ�ȥ
 * �����ʣ�������������Ͱѵ�ǰ��ʣ����������һ��Ȼ��ѵ�ǰS+��������������һ�ֵݹ�
 * ʣ����������ͬ��
 * ����൱�ھ��ǻ��ݣ����ϻ����ж��Ƿ�����������ɡ�
 * �Ҷ��ڵݹ�һֱ���Ĳ���
 * �������ͬ������
 * ��ȥ�����㷨
 * ��ʵ��������
 * �����ж��и���ֹ�����������ж�ʲô�����²��ܼ�������
 * ʲô������Ҫ�ѽ����ӽ�ȥ
 * Ȼ����ʲô����¼������ݣ�
 * ��ʵ�ݹ�Ҳ������ͬ�������۾Ϳ��ԡ�
 * FIGHTING
 */
public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n)
    {
    	List<String> list = new ArrayList<String>();//��������洢��ǰ
        DFS(n,n,"",list);
        return list;
    }
    public void DFS(int leftnum,int rightnum,String s,List<String> list)
    {
    	if(rightnum<leftnum)//�����=��ʣ��������С����ʣ����������������ǰ�Ѿ������������ˣ����ܵݹ���
    	{
    		return;
    	}
    	if(rightnum==0&&leftnum==0)//�������ʣ����������Ϊ0,�Ͱѵ�ǰ����ӽ�ȥ
    	{
    		list.add(s);
    	}
        if(leftnum> 0){
            DFS(leftnum-1,rightnum,s+"(",list);
        }//if
        // �����Ż���ʣ��
        if(rightnum > 0){
        	 DFS(leftnum,rightnum-1,s+")",list);
        }
    }
    public static void main(String[] args) {
    	Generate_Parentheses_22 l= new Generate_Parentheses_22();
    	List<String> list= l.generateParenthesis(3);
    	System.out.println(list);
	}
}
