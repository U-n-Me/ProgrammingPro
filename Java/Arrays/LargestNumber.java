public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> A) {
	    StringBuilder res = new StringBuilder();

	    Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return (""+b+a).compareTo(""+a+b);
            }
        });

	    // check if all zeros
	    if(A.get(0) == 0)return "0";
	    for(int num : A)
	        res.append(num);
	    return res.toString();
	}
}
