public class RepeatAndMissing {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    /*
	        Well, we can't modify given list nor we can allocate new space
	    */
	    // sum(1,2,3...,n) = sum(a[0], a[1], ..., a[n-1]) + B - A
	    // sum(1^2, 2^2, ..., N^2) = sum(a[0]^2, a[1]^1, ...., a[n-1]^2) + B^2 - A^2
	    int n = a.size();
	    int bMinusA = 0;
	    long bsqMinusAsq = 0;
	    // Instead of summing 1 to n, and summing all elems in array
	    // then subtracting, we can subtract correspondingly and add
	    // to prevent overflow, similarly we can find difference of squares
	    for(int i = 1; i <= n; i++){
	        long ai = a.get(i-1);
	        bMinusA += (i - a.get(i-1));
	        bsqMinusAsq += ((long)i*(long)i - ai*ai);
	    }

	    // now, we have b - a and b^2 - a^2 = (b+a)(b-a)
	    int bPlusA = (int)(bsqMinusAsq/bMinusA);
	    int A = (bPlusA - bMinusA)/2;
	    int B = bMinusA + A;
	    res.add(A);res.add(B);
	    return res;
	}
}
