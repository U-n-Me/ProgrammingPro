module.exports = {
	//param a : array of integers
	//return an integer
	jump : function(a){
        if(a.length < 2)return 0;
	    if(a[0] == 0)return -1;
	    var maxReach = a[0], steps = a[0], jumps = 1;
	    for(var i = 1; i < a.length; i++){
	        if(i == a.length-1)return jumps;
	        steps--;
	        maxReach = Math.max(maxReach, i + a[i]);
	        if(steps == 0){
	            jumps++;
	            // If we can't reach beyond i
	            if(maxReach <= i)return -1;
	            steps = maxReach - i;
	        }
	    }

	    return jumps;
	}
};
