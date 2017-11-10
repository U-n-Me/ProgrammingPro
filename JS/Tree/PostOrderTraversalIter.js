// Definition for a  binary tree node
//			function TreeNode(data){
//				this.data = data
//				this.left = null
//				this.right = null
//			}

module.exports = {
	//param root : root node of tree
	//return a array of integers
	postorderTraversal : function(root){
        var res = [], stack = [];
        while(root != null){
            res.push(root.data);
            if(root.left != 'undefined' && root.left != null)stack.push(root.left);
            if(root.right != 'undefined' && root.right != null)stack.push(root.right);
            root = stack.pop();
        }
        res.reverse();
        return res;
	}
};
