public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    // separate -ve and +ve numbers
	    // first missing num can atmost be n. Let's push every -ve num to left

	    int n = a.size();
	    int negInd = 0;
	    for(int i = 0; i < n; i++){
	        int num = a.get(i);
	        // Imp: As we are considering only +ve nums, we should treat 0 as negative
	        if(num == 0)num = -1;
	        if(num < 0){
	            a.set(i, a.get(negInd));
	            a.set(negInd, num);
	            negInd++;
	        }
	    }

	    // Now numbers from negInd to posInd (negInd inclusive) should have nums from 1 to n
	    // let's check first missing number
	    for(int i = negInd; i < n; i++){
	        int num = Math.abs(a.get(i));
	        if(num > 0 && num <= n)
	            a.set(num-1, -1*a.get(num-1));
	    }

	    // check if upto negInd, there is still some neg num
	    int i = 0;
	    for(i = 0; i < negInd; i++)
	        if(a.get(i) < 0)
	            return i + 1;

	   for(;i<n;i++)
	    if(a.get(i) > 0)return i + 1;

	    return n+1;
	}
}
