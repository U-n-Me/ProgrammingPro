module.exports = {
	//param A : array of strings
	//return an integer
	isValidSudoku : function(A){
        var sudoko = [];

        for(var j = 0; j < 9; j++){
            var rowArr = A[j].split('');
            sudoko.push(rowArr);
            var Set = {};
            for(var i = 0; i < 9; i++){
                var c = rowArr[i];
                //console.log(c);
                if(Set.hasOwnProperty(c))return 0;
                else if(c != '.')Set[c] = true;
            }
        }

        for(var col = 0; col < 9; col++){
            var Set = {};
            for(var row = 0; row < 9; row++){
                var c = sudoko[row][col];
                if(Set.hasOwnProperty(c))return 0;
                else if(c != '.')Set[c] = true;
            }
        }

         //check small sq.
	    for(var row = 0; row < 3; row++){
	        for(var col = 0; col < 3; col++){
	            var Set = {};
	            for(var i  = 0; i < 3; i++){
	                for(var j = 0; j < 3; j++){
	                    var c = sudoko[3*row+i][3*col+j];
                        if(Set.hasOwnProperty(c))return 0;
                        else if(c != '.')Set[c] = true;
	                }
	            }
	        }
	    }

        return 1;
	}
};
