module.exports = {
	//param A : array of integers
	//param B : array of integers
	//param C : integer
	//return an integer
	HotelBookingsPossible : function(A, B, K){
	    var srtFunc = function(a, b){
	      return a- b;
	    };
	    // JS's sort sorts in lexiographic order(so
	    // tell it how to sort)
        A.sort(srtFunc); B.sort(srtFunc);
        var al = A.length, bl = B.length;
        var i = 0, j = 0;
        while(i < al && j < bl){
            var arr = A[i], dep = B[j];
           if(arr >= dep){
                K++;
                j++;
            }else{
                if(K < 1)return 0;
                K--;
                i++;
            }
        }

        return 1;
	}
};
