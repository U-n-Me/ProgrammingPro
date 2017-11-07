module.exports = {
	//param A : integer
	//param B : integer
	//return an integer
	uniquePaths : function(A, B){
        var nPc = function(n, c){
    	    var c1 = Math.min(c, n-c);
    	    var c2 = Math.max(c, n-c);
    	    var res = 1;
    	    for(var i = 1; i <= c1; i++){
    	        res *= (n - i + 1);
    	        res /= i;
    	    }
    	    return res;
        };

        return nPc(A + B - 2, A - 1);
	}
};
