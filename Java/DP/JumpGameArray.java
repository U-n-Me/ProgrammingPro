public class Solution {
	public int canJump(ArrayList<Integer> a) {
	    // http://www.geeksforgeeks.org/minimum-number-jumps-reach-endset-2on-solution/
	    if(a.size() < 2)
	        return 1;
	   if(a.get(0) == 0)return 0;

	   int maxReach = a.get(0), steps = a.get(0);
	   for(int i = 1; i < a.size(); i++){
	       if(i == a.size()-1)return 1;
	       maxReach = Math.max(maxReach, i + a.get(i));
	       if(a.size()-1 <= maxReach)return 1;
	       steps--;

	       if(steps == 0){
	           // if we can't move beyond i
	           if(maxReach <= i)return 0;
	           steps = maxReach - i;
	       }
	   }
	   return 0;
	}
}
