/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public int dfsHeight(TreeNode root) {
        if (root == null) return 0;
        
        int left = dfsHeight(root.left);
        if (left == -1) return -1;
        int right = dfsHeight(root.right);
        if (right == -1) return -1;
        
        if (Math.abs(left - right) > 1) return -1;
        
        return Math.max(left, right) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
}
