module.exports = {
	//param A : array of integers
	//return an integer
	maxProfit : function(A){
        var profit = 0;
        for(var i = 1; i < A.length; i++)
            if(A[i] > A[i-1])
                profit += (A[i] - A[i-1]);
        return profit;
	}
};
