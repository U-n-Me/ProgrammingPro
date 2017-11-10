/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode currentLevel = root, nroot = root;
        while(root != null){
         while(currentLevel != null){
             if(currentLevel.left != null){
                 currentLevel.left.next = getNext(currentLevel, true);
             }
             if(currentLevel.right != null){
                 currentLevel.right.next = getNext(currentLevel.next, false);
             }
             currentLevel = currentLevel.next;
         }
         currentLevel = getNext(root, false);
         root = currentLevel;
        }

        // Another Solution, we are not creating extra elems so cons space
        /*TreeLinkNode special = new TreeLinkNode(13);
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);queue.add(special);
        TreeLinkNode prev, curr;
        while((prev = queue.remove()) != special){
            if(prev.left != null)queue.add(prev.left);
            if(prev.right != null)queue.add(prev.right);
            while((curr = queue.remove()) != special){
                prev.next = curr;
                prev = curr;
                if(prev.left != null)queue.add(prev.left);
                if(prev.right != null)queue.add(prev.right);
            }
            queue.add(special);
        }
        */



        //Debug, prints the tree
        /*root = nroot;
        while(true){
            while(nroot != null){
                System.out.print(nroot.val+" ");
                nroot = nroot.next;
            }
            nroot = getNext(root, false);
            root = nroot;
            System.out.println();
            if(root == null)break;
        }*/
    }

    public TreeLinkNode getNext(TreeLinkNode node, boolean same){
        if(node == null)return null;
        if(!same && node.left != null)return node.left;
        if(node.right != null)return node.right;
        while(node.next != null){
            node = node.next;
            if(node.left != null)return node.left;
            if(node.right != null)return node.right;
        }
        return null;
    }
}
