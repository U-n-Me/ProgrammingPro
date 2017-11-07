module.exports = {
	//param A : array of integers
	//return a strings
	largestNumber : function(A){
        A.sort(function(a, b){
            return (""+b+a) - (""+a+b);
        });
        //console.log(A);
    	var res = "";
    	if(A[0] == 0)return 0;
    	A.forEach(function(num){
    	    res += num;
    	});
    	return res;
	}
};
