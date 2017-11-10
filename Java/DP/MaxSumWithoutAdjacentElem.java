public class Solution {
	public int adjacent(ArrayList<ArrayList<Integer>> a) {
	    int size = a.get(0).size();
	    for(int i = 0; i < size; i++)
	        a.get(0).set(i, Math.max(a.get(0).get(i), a.get(1).get(i)));
	   // Now we'll use second row for memoization
	   ArrayList<Integer> A = a.get(0), DP = a.get(1);
	   if(size == 1)return A.get(0);
	   if(size < 3)return Math.max(A.get(0), A.get(1));

	   DP.set(0, A.get(0));
	   DP.set(1, Math.max(DP.get(0), A.get(1)));

	   for(int i = 2; i < size; i++){
	       DP.set(i, Math.max(DP.get(i-1), DP.get(i-2) + A.get(i)));
	   }
	   return DP.get(size-1);
	}
}
