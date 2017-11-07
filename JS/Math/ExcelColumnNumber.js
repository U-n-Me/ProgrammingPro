module.exports = {
	//param A : string
	//return an integer
	titleToNumber : function(A){
        var res = 0;
        for(var i = 0; i < A.length; i++){
            res = res * 26 + (A.charCodeAt(i) - 64);
        }
        return res;
	}
};
