module.exports = {
	//param A : string
	//param B : array of strings
	//return a array of integers
	findSubstring : function(A, B){
        var res = [];
        var map = {};
        B.forEach(function(str){
            if(!map.hasOwnProperty(str))map[str] = 0;
            map[str] = map[str] + 1;
        });

        var n = A.length, chunkSize = B[0].length;
        var len = B.length * chunkSize;
        for(var i = 0; i + len <= n; i++){
            var substr = A.substring(i, i + len); var allFound = true;
            for(var j = 0; j + chunkSize <= len; j += chunkSize){
                var chunkSub = substr.substring(j, j + chunkSize);
                if(!map.hasOwnProperty(chunkSub))allFound = false;
                else{
                    map[chunkSub] = map[chunkSub] - 1;
                    if(map[chunkSub] < 0)allFound = false;
                }
            }

            for(var j = 0; j + chunkSize <= len; j += chunkSize){
                var chunkSub = substr.substring(j, j + chunkSize);
                if(map.hasOwnProperty(chunkSub)){
                    map[chunkSub] = map[chunkSub] + 1;
                }
            }
            if(allFound)res.push(i);
        }
        //console.log(A.substring(98));
        return res;
	}
};
