package leetcode;


public class leetcode_98 {
	public boolean isValidBST(TreeNode root) 
    {
    	if (root == null) return true;  
        if (!dfsLeft(root.left, root.data) || !dfsRight(root.right, root.data)) return false;  
        return isValidBST(root.left) && isValidBST(root.right);  
    }
    
    public boolean dfsLeft(TreeNode root, int value) {  
        if (root == null) return true;  
        if (root.data >= value) return false;  
        return dfsLeft(root.left, value) && dfsLeft(root.right, value);  
    }  
      
    public boolean dfsRight(TreeNode root, int value) {  
        if (root == null) return true;  
        if (root.data <= value) return false;  
        return dfsRight(root.left, value) && dfsRight(root.right, value);  
    }  
}
