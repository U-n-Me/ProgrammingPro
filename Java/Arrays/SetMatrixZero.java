public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    boolean rowZero = false, colZero = false;
	    int n = a.size(), m = a.get(0).size();
	    for(int row = 0; row < n; row++)
	        if(a.get(row).get(0) == 0)colZero = true;
	    for(int col = 0; col < m; col++)
	        if(a.get(0).get(col) == 0) rowZero = true;

	   for(int row = 1; row < n; row++){
	       for(int col = 1; col < m; col++){
	           if(a.get(row).get(col) == 0){
	               a.get(0).set(col, 0);
	               a.get(row).set(0, 0);
	           }
	       }
	   }

	   for(int row = 1; row < n; row++){
	       for(int col = 1; col < m; col++){
	           if(a.get(0).get(col) == 0 || a.get(row).get(0) == 0)
	            a.get(row).set(col, 0);
	       }
	   }
	   if(rowZero){
	    for(int col = 0; col < m; col++)
	        a.get(0).set(col, 0);
	   }
	   if(colZero){
	    for(int row = 0; row < n; row++)
	        a.get(row).set(0, 0);
	   }
	}
}
