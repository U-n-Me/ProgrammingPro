public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    int resS = -1, resE = -1; long maxS = 0, sum = 0;
	    int start = 0, end = 0;
	    for(int i = 0; i < a.size(); i++){
	        int num = a.get(i);
	        if(num < 0){
	            sum = 0;
	            start = end = i + 1;
	        }

	        else{
	            sum += num;
	            end++;
	            if(sum > maxS){
	                maxS = sum;
	                resS = start;
	                resE = end;
	            }else if(sum == maxS){
	                if((end - start) > (resE - resS)){
	                    resS = start;
	                    resE = end;
	                }
	            }
	        }
	    }
       if(resE < 0)return new ArrayList<Integer>();
	    return new ArrayList<Integer>(a.subList(resS, resE));
	}
}
