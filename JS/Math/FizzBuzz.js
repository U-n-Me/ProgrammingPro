module.exports = {
 //param A : integer
 //return a array of strings
	fizzBuzz : function(A){
        var res = [];
        for(var val = 1; val <= A; val++){
            var here = "";
            if(val % 3 != 0 && val % 5 != 0)here = val;
            else{
                if(val % 3 == 0)here += "Fizz";
                if(val % 5 == 0)here += "Buzz";
            }
            res.push(here);
        }
        return res;
	}
};
