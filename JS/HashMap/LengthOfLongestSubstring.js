module.exports = {
	//param A : string
	//return an integer
	lengthOfLongestSubstring : function(A){
        var map = {};
        var max = 0, curr_max = 0;
        A = A.split("");
        A.forEach(function(char, index){
            if(!map.hasOwnProperty(char)){
                map[char] = index;
                curr_max++;
            }else{
                var cInd = map[char];
                if(cInd >= index - curr_max){
                    max = Math.max(max, curr_max);
                    curr_max = index - cInd;
                }else curr_max++;
                map[char] = index;
            }
        });
        return Math.max(max, curr_max);
	}
};
