module.exports = {
	//param A : array of integers
	//return an integer
	canJump : function(a){
         // http://www.geeksforgeeks.org/minimum-number-jumps-reach-endset-2on-solution/
	    if(a.length < 2)
	        return 1;
	   if(a[0] == 0)return 0;

	   var maxReach = a[0], steps = a[0];
	   for(var i = 1; i < a.length; i++){
	       if(i == a.length - 1)return 1;
	       maxReach = Math.max(maxReach, i + a[i]);
	       if(a.length-1 <= maxReach)return 1;
	       steps--;

	       if(steps == 0){
	           // if we can't move beyond i
	           if(maxReach <= i)return 0;
	           steps = maxReach - i;
	       }
	   }
	   return 0;
	}
};
