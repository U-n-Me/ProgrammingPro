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
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    pathSum(root, sum, res, new ArrayList<Integer>());
	    return res;
	}

	public void pathSum(TreeNode root, int sum, ArrayList<ArrayList<Integer>> res,
	        ArrayList<Integer> path){
	    if(root == null)return;
	    if(root.left == null && root.right == null){
	        if(root.val == sum){
	            path.add(root.val);
	            res.add(new ArrayList<Integer>(path));
	            path.remove(path.size() - 1);
	        }
	        return;
	    }
	    path.add(root.val);
	    pathSum(root.left, sum - root.val, res, path);
	    pathSum(root.right, sum - root.val, res, path);
	    path.remove(path.size() - 1);
	}

}
