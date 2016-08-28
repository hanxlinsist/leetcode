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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<List<Integer>>();
        
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> sameLevel = new LinkedList<TreeNode>();
        sameLevel.offer(root);
        
        while (!sameLevel.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            List<Integer> ele = new LinkedList<Integer>();
            
            while (!sameLevel.isEmpty()) {
                TreeNode currNode = sameLevel.poll();
                ele.add(currNode.val);
                
                if (currNode.left != null) temp.offer(currNode.left);
                if (currNode.right != null) temp.offer(currNode.right);
            }
            
            sameLevel = temp;
            result.add(ele);
        }
        
        return result;
    }
}
