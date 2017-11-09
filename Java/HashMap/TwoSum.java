public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    ArrayList<Integer> res = new ArrayList<>();

	    for(int i = 0 ; i < a.size(); i++){
	        if(map.containsKey(b-a.get(i))){
	            int prevInd = map.get(b-a.get(i));
	                res.add(prevInd);
	                res.add(i+1);
	                return res;
	        }
	        if(!map.containsKey(a.get(i)))
	            map.put(a.get(i), i+1);
	    }

	    return res;
	}
}
