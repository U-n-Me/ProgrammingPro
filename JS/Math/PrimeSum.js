module.exports = {
	//param A : integer
	//return a array of integers
	primesum : function(A){
        var isPrime = function(n){
            if(n == 3)return true;
            if((n % 3) == 0) return false;
            var rng = parseInt(Math.sqrt(n));
            //console.log(n+" "+rng);
            for(var i = 5; i <= rng; i += 6){
                if((n % i) == 0 || (n % (i + 2)) == 0)
                    return false;
            }
            return true;
        };
        if(A === 4)return [2, 2];
        for(var i = 3; i < A / 2; i += 2){
            if(isPrime(i) && isPrime(A - i))
                return [i, A - i];
        }
	}
};
