module.exports = {
	//param A : array of strings
	//return a array of strings
	makeTrie : function(A){
	     var trie = {
	        count: 0,
	    };
	    for (var i = 0; i < A.length; i++) {
	        var pos = trie;
	        var word = A[i];
	        for (var j = 0; j < word.length; j++) {
	            var letter = word[j];
	            if (pos.hasOwnProperty(letter)) {
	                pos = pos[letter];
	                pos.count++;
	            } else {
	                pos[letter] = {
	                    count: 1
	                }
	                pos = pos[letter];
	            }
	        }
	    }
	    return trie;
	},

	prefix : function(A){
        var trie = this.makeTrie(A);
        var res = [];
        for (var i = 0; i < A.length; i++) {
            var word = A[i];
            var pos = trie;
            var j = 0;
            var prefix = "";
            while (pos.count != 1) {
                prefix += word[j];
                pos = pos[word[j]];
                j++;
            }
            res.push(prefix);
        }
        return res;
	}
};
