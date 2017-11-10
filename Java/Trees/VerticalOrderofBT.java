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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(A == null)return res;

        // Get left and right levels
        int[] levels = new int[2];
        levels[0] = Integer.MAX_VALUE; // left will have negative level values
        levels[1] = Integer.MIN_VALUE; // right will have positive level values
        getExtremes(A, 0, levels);
        int tot = levels[1] - levels[0]; // levels[0] is negative
        for(int i = 0; i <= tot; i++)
            res.add(new ArrayList<Integer>());
        int start = -levels[0];
        /*
            Instead of getting extreme level values, you can just add TreeNodes in hashmap
            For more info: check hint ans;
            We will save some time by sacrificing memory
        */

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(A, 0));
        while(!queue.isEmpty()){
            Node node = queue.poll();
            res.get(node.level+start).add(node.tree.val);
            if(node.tree.left != null)queue.add(new Node(node.tree.left, node.level-1));
            if(node.tree.right != null)queue.add(new Node(node.tree.right, node.level+1));
        }
        return res;
    }

    public void getExtremes(TreeNode a, int level, int[] levels){
        if(a == null)return;
        if(level < levels[0])levels[0] = level;
        if(level > levels[1])levels[1] = level;
        getExtremes(a.left, level - 1, levels);
        getExtremes(a.right, level + 1, levels);
    }

    class Node{
        TreeNode tree;
        int level;
        public Node(TreeNode n, int l){
            tree = n;
            level = l;
        }
    }
}
