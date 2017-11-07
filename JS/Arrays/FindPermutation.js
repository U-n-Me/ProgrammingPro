module.exports = {
	//param A : array of chars
  // param B: integer
	//return an array of integer
	permutation : function(A, B){
        var largest = B, smallest = 1;
        var res = [];
        A.forEach(function(char){
          if(char === 'I')
            res.push(smallest++);
          else
            res.push(largest--);
        });
        return res;
	}
};
