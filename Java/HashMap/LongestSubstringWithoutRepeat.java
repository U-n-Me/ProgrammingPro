public class Solution {
	public int lengthOfLongestSubstring(String a) {
	    HashMap<Character, Integer> map = new HashMap<>();
	    int max = 0, curr_max = 0;
	    for(int i = 0; i < a.length(); i++){
	        char c = a.charAt(i);
	        if(!map.containsKey(c)){
	            map.put(c, i);
	            curr_max++;
	        }
	       else{
	           int cIndex = map.get(c);
	           if(cIndex >= i - curr_max){
	               max = Math.max(max, curr_max);
	               curr_max = i - cIndex;
	           }
	           else
	            curr_max++;
	           map.put(c, i);
	       }
	    }
	    max = Math.max(max, curr_max);
	    return max;
	}
}
