public class Solution {
	public int climbStairs(int A) {
	    if(A < 3)return A;
	    int a= 1, b = 2;
	    for(int i = 3; i <= A;i++){
	        int c = a+b;
	        a = b;
	        b = c;
	    }
	    return b;
	}
}
