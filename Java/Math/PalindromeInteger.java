public class Solution {
	public boolean isPalindrome(int a) {
	    if(a < 0)return false;
	    int aa = a, reverse = 0;
	    while(aa > 0){
	        reverse = reverse * 10 + aa % 10;
	        aa /= 10;
	    }
	    return reverse == a;
	}
}
