module.exports = {
	//param A : integer
	//return an integer
	reverse : function(A){
        var sign = 1;
        var MAX = 2147483647;
        if(A < 0){
            A = -A;
            sign = -1;
        }
        var res = 0;
        while(A > 0){
            //console.log(A+" "+res);
            res = res * 10 + A % 10;
            if(res > MAX)return 0;
            A = parseInt(A / 10);
        }
        return sign * res;
	}
};
