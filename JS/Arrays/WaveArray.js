module.exports = {
	//param A : array of integers
	//return a array of integers
	wave : function(A){
        A.sort(function(a, b){return a- b;});
        for(var i = 1; i < A.length; i+= 2){
            var v = A[i];
            A[i] = A[i - 1];
            A[i - 1] = v;
        }
        return A;
	}
};
