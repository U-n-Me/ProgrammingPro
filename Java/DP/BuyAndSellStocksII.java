public class Solution {
	public int maxProfit(final List<Integer> a) {
	    // http://www.geeksforgeeks.org/stock-buy-sell/
	    // 100, 180, 260, 310, 40, 535, 695
	    // solve by finding local minima and maxima


	     //   Simply you can buy at i and sell at i+1 if val[i+1] > val[i]
	        return thisSolution(a);


	    /*
	    int profit = 0, size = a.size(), i = 0;
	    while(i < size){
	        // find local minima, upto size-2 because buying at size-1 means you can't
	        // sell it
	        int buy = 1, sell = 0;
	        while(i < (size-1) && a.get(i) > a.get(i+1))i++;
	        if(i < size-1)
	            buy = a.get(i);
	        i++;
	        // find local maxima
	        while(i < size-1 &&  a.get(i) < a.get(i+1))i++;
	        if(i < size)
	            sell = a.get(i);
	        //System.out.println(sell+" "+buy);
	        if(sell - buy > 0)profit += (sell - buy);
	        i++;
	    }
	    return profit;
	    */
	}

	public int thisSolution(List<Integer> a){
	    int profit = 0;
	    for(int i = 1; i < a.size(); i++){
	        if(a.get(i) > a.get(i-1))
	            profit += (a.get(i) - a.get(i-1));
	    }
	    return profit;
	}
}
