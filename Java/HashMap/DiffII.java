public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    HashSet<Integer> map = new HashSet<>();
	    for(int i = 0; i < a.size(); i++){
	        int val = a.get(i);
	        if(map.contains(val-b) || map.contains(val+b))return 1;
	        map.add(val);
	    }
	    return 0;
	}
}
