public class Solution {
	public int reverse(int a) {
	    int sign = 1;
	    if(a < 0){
	        sign = -1;
	        a = -a;
	    }
	    long reverse = 0;
	    while(a > 0){
	        reverse = reverse * 10 + a % 10;
	        //System.out.println(a+" "+reverse);
	        a /= 10;
	        if(reverse > Integer.MAX_VALUE)return 0;
	    }
	    return (int)(sign*reverse);
	}
}
