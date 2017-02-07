package leetcode;

public class Path_Sum_II_437 {
	/*
	 * leetcode 上好多个题都是这种类型的，各种加和，但是思路都是类似的
	 */
	   public int pathSum(TreeNode root, int sum) {
	        if(root == null)
	            return 0;
	        return dfs(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
	    }

	    private int dfs(TreeNode root, int sum){
	        int res = 0;
	        if(root == null)
	            return 0;
	        if(sum == root.val)
	            res++;
	        res+=dfs(root.left,sum - root.val);
	        res+=dfs(root.right,sum - root.val);
	        return res;
	    }
}
