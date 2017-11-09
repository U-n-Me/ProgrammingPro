module.exports = {
	//param A : array of integers
	//param B : integer
	//return an integer
	diffPossible : function(A, B){
        var map = {};
        for(var i = 0; i < A.length; i++){
            var val = A[i];
            if(map.hasOwnProperty(val - B) || map.hasOwnProperty(val + B))
                return 1;
            map[val] = true;
        }
        return 0;
	}
};
