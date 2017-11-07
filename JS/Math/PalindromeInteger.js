module.exports = {
	//param A : integer
	//return an integer
	isPalindrome : function(A){
        var reverse = 0;
        var a = A;
        while(a > 0){
            reverse = 10 * reverse + a % 10;
            a = parseInt(a / 10);
        }
        return reverse == A ? 1 : 0;
	}
};
