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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> container = new LinkedList<List<Integer>>();
        
    	if (root == null) return container;
    	
    	Queue<TreeNode> sameLevel = new LinkedList<TreeNode>();
    	sameLevel.offer(root);
    	
    	while (!sameLevel.isEmpty()) {
		List<Integer> sameLevel_num = new LinkedList<Integer>();
		Queue<TreeNode> temp = new LinkedList<TreeNode>();
	
			while(!sameLevel.isEmpty()) {
				TreeNode currentNode = sameLevel.poll();
				sameLevel_num.add(0, currentNode.val);
				if(currentNode.right != null) temp.offer(currentNode.right);
				if(currentNode.left != null) temp.offer(currentNode.left);
			}
		
			container.add(0, sameLevel_num);
			sameLevel = temp;
		}
	return container;
    }
}
