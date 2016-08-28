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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) 
            return null;
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
	queue.offer(root);
	while ( !queue.isEmpty() ) {
		TreeNode currentNode = queue.poll();
		TreeNode temp = currentNode.left;
		currentNode.left = currentNode.right;
		currentNode.right = temp;
		
		if ( currentNode.left != null )
			queue.offer(currentNode.left);
		if ( currentNode.right != null )
			queue.offer(currentNode.right);
	}
	return root;
    }
}
