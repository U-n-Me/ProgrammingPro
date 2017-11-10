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
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    if(a == null)return res;
	    Stack<TreeNode> stack = new Stack<>();
	    stack.push(a);
	    while(true){
	        a = a.left;
	        while(a == null && !stack.isEmpty()){
	            a = stack.pop();
	            res.add(a.val);
	            a = a.right;
	        }
	        if(a == null)break;
	        stack.push(a);
	    }
	    return res;
	}

}
