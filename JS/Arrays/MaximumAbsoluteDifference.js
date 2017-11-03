module.exports = {
 //param A : array of integers
 //return an integer
	MaximumAbsoluteDifference : function(A){
      var MAX = 9999999999, MIN = -9999999999;
      var max1 = MIN, max2 = MIN;
      var min1 = MAX, min2 = MAX;
       A.forEach(function(value, index){
           max1 = Math.max(max1, value + index);
           max2 = Math.max(max2, value - index);

           min1 = Math.min(min1, value + index);
           min2 = Math.min(min2, value - index);
       });
       return Math.max((max1 - min1), (max2 - min2));
	}
};
