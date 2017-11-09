module.exports = {
	//param A : array of integers
	//param B : integer
	//return a array of integers
	twoSum : function(A, B){
        var map = {};
        for(var index = 0; index < A.length; index++){
            var value = A[index];
            if(map.hasOwnProperty(B - value)){
                var prevIndex = map[B - value];
                return [prevIndex, index + 1];
            }
            if(!map.hasOwnProperty(value))
                map[value] = index + 1;
        }
        return [];
	}
};
