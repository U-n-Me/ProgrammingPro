module.exports = {
	//param A : array of integers
	//param B : array of integers
	//return an integer
	MinStepsInInfiniteGrid : function(A, B){
        var x = A[0];
        var y = B[0];
        var dist = 0;
        for(var i = 1; i < A.length; i++){
            dist += Math.max(Math.abs(A[i] - x), Math.abs(B[i] - y));
            x = A[i]; y = B[i];
        }
        return dist;
	}
};
