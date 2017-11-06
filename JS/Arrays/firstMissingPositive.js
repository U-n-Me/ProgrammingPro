module.exports = {
	//param A : array of integers
	//return an integer
	firstMissingPositive : function(A){
        const n = A.length;
        for(var i = 0; i < n; i++){
            var ai = A[i];
            if(ai > 0 && ai <= n){
                var pos = ai - 1;
                if(A[pos] != ai){
                    A[i] = A[pos];
                    A[pos] = ai;
                    i--;
                }
            }
        }

        for(var i = 0; i < n; i++){
            if(A[i] != i + 1)return (i + 1);
        }
        return n + 1;
	}
};
