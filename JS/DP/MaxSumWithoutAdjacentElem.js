module.exports = {
	//param A : array of array of integers
	//return an integer
	adjacent : function(A){
        var len = A[0].length;
        for(var i = 0; i < len; i++)
            A[0][i] = Math.max(A[0][i], A[1][i]);
        var aa = A[0], mem = A[1];
        mem[0] = aa[0];
        mem[1] = Math.max(aa[0], aa[1]);
        for(var i = 2; i < len; i++)
            mem[i] = Math.max(aa[i] + mem[i-2], mem[i-1]);
        return mem[len-1];
	}
};
