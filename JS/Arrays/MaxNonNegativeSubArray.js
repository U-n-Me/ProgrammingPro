module.exports = {
	//param A : array of integers
	//return a array of integers
	maxset : function(A){
        var resS = -1, resE = -1, maxS = 0, sum = 0, start = 0, end = 0;
        A.forEach(function(ai, i){
            if(ai < 0){
                sum = 0;
                start = end = i + 1;
            }else{
                end++;
                sum += ai;
                if(sum > maxS){
                    maxS = sum;
                    resE = end;
                    resS = start;
                }else if(sum == maxS){
                    if((end - start) > (resE - resS)){
                        resE = end;
                        resS = start;
                    }
                }
            }
        });
        if(resS < 0)return [];
        return A.slice(resS, resE);
	}
};
