module.exports = {
	//param A : integer
	//return an integer
	climbStairs : function(A){
	    if(A < 3)return A;
	    var a = 1, b = 2;
	    for(var i = 3; i <= A;i++){
	        var c = a+b;
	        a = b;
	        b = c;
	    }
	    return b;
	    }
    };
