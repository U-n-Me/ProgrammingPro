public class Solution {
	public int jump(ArrayList<Integer> a) {
	    if(a.size() < 2)return 0;
	    if(a.get(0) == 0)return -1;
	    int maxReach = a.get(0), steps = a.get(0), jumps = 1;
	    for(int i = 1; i < a.size(); i++){
	        if(i == a.size()-1)return jumps;
	        steps--;
	        maxReach = Math.max(maxReach, i + a.get(i));
	        if(steps == 0){
	            jumps++;
	            // If we can't reach beyond i
	            if(maxReach <= i)return -1;
	            steps = maxReach - i;
	        }
	    }

	    return jumps;
	}
}
