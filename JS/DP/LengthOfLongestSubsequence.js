module.exports = {
 //param A : array of integers
 //return an integer
	longestSubsequenceLength : function(A){
        var lis = [], lds = [];
        A.forEach(function(val){
            lis.push(1);
            lds.push(1);
        });
        var len = A.length;

         // Get LIS
         for(var i = 1; i < len; i++){
             for(var j = 0; j < i; j++)
                if(A[j] < A[i] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1
         }

         // Get LDS
         for(var i = len-2; i >= 0; i--){
             for(var j = len - 1; j > i; j--)
                if(A[j] < A[i] && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1
         }

         var max = 0;
         for(var i = 0; i < len; i++)
            max = Math.max(max, lis[i] + lds[i] - 1);
         return max;
	}
};
