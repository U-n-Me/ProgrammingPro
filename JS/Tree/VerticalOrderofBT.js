// Definition for a  binary tree node
//    function TreeNode(data){
//      this.data = data
//      this.left = null
//      this.right = null
//    }

module.exports = {
 //param root : root node of tree
 //return a array of array of integers
	verticalOrderTraversal : function(root){
        var res = [], map = {}, minLevel = 99999999;
        var queue = [{node: root, level : 0}];
        while(queue.length > 0){
            var TreeNode = queue.shift();
            var node = TreeNode.node, level = TreeNode.level;
            if(level < minLevel)minLevel = level;
            if(!map.hasOwnProperty(level))map[level] = [];
            map[level].push(node.data);

            if(node.left != null)queue.push({node: node.left, level : level - 1});
            if(node.right != null)queue.push({node: node.right, level: level + 1});
        }

        while(map.hasOwnProperty(minLevel))
            res.push(map[minLevel++]);
        return res;
	}
};
