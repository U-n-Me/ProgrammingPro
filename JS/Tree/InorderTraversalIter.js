// Definition for a  binary tree node
//			function TreeNode(data){
//				this.data = data
//				this.left = null
//				this.right = null
//			}

module.exports = {
	//param root : root node of tree
	//return a array of integers
	inorderTraversal : function(root){
        var res = [], stack = [];
        stack.push(root);
        while(stack.length > 0){
            root = root.left;
            while(root == null && stack.length > 0){
                root = stack.pop();
                res.push(root.data);
                root = root.right;
            }
            if(root != null)stack.push(root);
        }
        return res;
	}
};
