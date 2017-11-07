public class Solution {
	public int titleToNumber(String a) {
	    int len = a.length()-1;
	    int res = 0;
	    for(int i = 0; i <= len; i++){
	        char c = a.charAt(i);
	        res = 26 * res + (c - 'A' + 1);
	    }
	    return res;
	}
}
