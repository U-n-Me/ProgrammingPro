public class Solution {
	public int uniquePaths(int a, int b) {
	    return nPc(a+b-2, a-1);
	}

	public int nPc(int n, int c){
	    int c1 = Math.min(c, n-c);
	    int c2 = Math.max(c, n-c);
	    long res = 1;
	    for(int i = c2+1; i <= n; i++)
	        res *= i;
	   for(int i = 2; i<= c1; i++)
	    res /= i;
	    return (int)res;
	}
}
