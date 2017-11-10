/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    if(a == null)  return res;
	    // Do root right left, that's very easy
	    // and then reverse the arraylist
	    Stack<TreeNode> stack = new Stack<>();
	    stack.push(a);
	    while(!stack.isEmpty()){
	        a = stack.pop();
	        res.add(a.val);
	        // for root, right, left. add left to stack first
	        if(a.left != null)stack.push(a.left);
	        if(a.right != null)stack.push(a.right);
	    }
	    Collections.reverse(res);
	    return res;
	}

}
