// Definition for a  binary tree node
//			function TreeNode(data){
//				this.data = data
//				this.left = null
//				this.right = null
//			}

module.exports = {
	//param root : root node of tree
	//param sum : integer
	//return a array of array of integers
	pathSum : function(Root, Sum){
        var res = [];
        var addPaths = function(root, sum, path){
            if(root == null)return;
            if(root.left == null && root.right == null){
                if(root.data == sum){
                    path.push(root.data);
                    res.push(path.slice());
                    //console.log(path);
                    path.pop();
                }
                return;
            }
            path.push(root.data);
            addPaths(root.left, sum - root.data, path);
            addPaths(root.right, sum - root.data, path);
            path.pop();
        };
        addPaths(Root, Sum, []);
        return res;
	}
};
