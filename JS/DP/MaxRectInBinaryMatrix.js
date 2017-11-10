module.exports = {
	//param A : array of array of integers
	//return an integer
	maximalRectangle : function(A){
	    var maxRectInHist = function(hist){
    	    var maxArea = 0, area = 0, i = 0;
    	    var stack = [];
    	    while(i < hist.length){
    	        var popped = stack.pop();
    	        if(popped == null){
    	            stack.push(i++);
    	        }else if(hist[i] >= hist[popped]){
    	            stack.push(popped);
    	            stack.push(i++);
    	        }else{
    	            var bottom = stack.pop();
    	            if(bottom == null)bottom = -1;
    	            else stack.push(bottom);
    	            area = hist[popped] * (i - bottom - 1);
    	            maxArea = Math.max(area, maxArea);
    	        }
    	    }
    	    var popped = stack.pop();
    	    while(popped != null){
                var bottom = stack.pop();
                if(bottom == null)bottom = -1;
                else stack.push(bottom);
                area = hist[popped] * (i - bottom - 1);
                maxArea = Math.max(area, maxArea);
    	        popped = stack.pop();
    	    }
    	    return maxArea;
    	};

        var max = 0, rows = A.length, cols = A[0].length;
        max = maxRectInHist(A[0]);
        for(var row = 1; row < rows; row++){
            for(var col = 0; col < cols; col++){
                if(A[row][col] == 1)
                    A[row][col] = 1 + A[row-1][col];
            }
            max = Math.max(max, maxRectInHist(A[row]));
        }
        return max;
	}
};
