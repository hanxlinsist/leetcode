/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
/**
 * String 版本
 */
pblic class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new LinkedList<String>(); 
        List<String> result = new LinkedList<String>();
        helper(root, "", result);
        return result;
    }
    
    
    private void helper(TreeNode root, String path, List<String> result) {
        if (root.left == null && root.right == null) result.add(path + root.val);
        if (root.left != null) helper(root.left, path + root.val + "->", result);
        if (root.right != null) helper(root.right, path + root.val + "->", result);
    }
}

/**
 * StringBuilder 版本
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new LinkedList<String>(); 
        
        List<String> result = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        helper(root, sb, result);
        
        return result;
    }
    
    
    private void helper(TreeNode root, StringBuilder sb, List<String> result) {
        if (root == null) return;
        
        int length = sb.length();
        sb.append(root.val);
        
        if (root.left == null && root.right == null)
            result.add(sb.toString());
        else {
            sb.append("->");
            helper(root.left, sb, result);
            helper(root.right, sb, result);
        }
        
        sb.setLength(length);
    }
}
