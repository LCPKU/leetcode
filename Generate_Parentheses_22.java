package leetcode;
import java.util.List;
import java.util.ArrayList;
/*
 * 这个题还是参考了网上，今天上午也看了一个题，241，也是括号问题，我根本就没做出来，网上的答案也没看懂
 * 这个题还是参考了网上
 * 这个稍微利用了回溯一下下
 * 我刚开始想的时候
 * 是想把括号一对一对的插入，但是我发现我的想法我自己都实现不了
 * 感觉很伤心
 * 然后看到了这种方法，其实就是回溯，设置这样几个数字
 * leftnum表示当前还剩下的左括号数，rightnum表示当前还剩下的右括号数
 * 如果右剩余括号数小于左剩余括号数，表明当前已经不满足条件了，不能递归了
 * 如果左右剩余括号数都为0
 * 就把当前数添加进去
 * 如果还剩下左括号数，就把当前左剩余括号数减一，然后把当前S+“（”，进行下一轮递归
 * 剩余右括号数同理，
 * 最后相当于就是回溯，不断回溯判断是否满足条件便可。
 * 我对于递归一直理解的不好
 * 这个回溯同样不行
 * 回去看看算法
 * 其实回溯问题
 * 就是判断有个终止条件，首先判断什么条件下不能继续回溯
 * 什么条件下要把结果添加进去
 * 然后在什么情况下继续回溯，
 * 其实递归也是树，同样的理论就可以。
 * FIGHTING
 */
public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n)
    {
    	List<String> list = new ArrayList<String>();//这个用来存储当前
        DFS(n,n,"",list);
        return list;
    }
    public void DFS(int leftnum,int rightnum,String s,List<String> list)
    {
    	if(rightnum<leftnum)//如果有=右剩余括号数小于左剩余括号数，表明当前已经不满足条件了，不能递归了
    	{
    		return;
    	}
    	if(rightnum==0&&leftnum==0)//如果左右剩余括号数都为0,就把当前数添加进去
    	{
    		list.add(s);
    	}
        if(leftnum> 0){
            DFS(leftnum-1,rightnum,s+"(",list);
        }//if
        // 右括号还有剩余
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
