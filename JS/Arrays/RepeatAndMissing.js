module.exports = {
	//param A : array of integers
	//return a array of integers
	RepeatAndMissing : function(A){
    /*
      Can be easily done by modifying given array or by
      allocating extra space.
      Let's do it Mathematically
    */
    const n = A.length;
    // a repeats, and b is missing
    var bMinusA = 0, bMinusASq = 0;
    A.forEach(function(value, index){
      bMinusA += ((index + 1) - value);
      bMinusASq += ((index + 1) * (index + 1) - value * value);
    });

    var bPlusA = parseInt(bMinusASq / bMinusA);
    var a = parseInt((bPlusA - bMinusA) / 2);
    var b = bMinusA + a;
    return [a, b];
	}
};
