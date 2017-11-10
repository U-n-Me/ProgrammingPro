public class Solution {
	public int maximalRectangle(ArrayList<ArrayList<Integer>> A) {
        int maxArea = 0;
        int rows = A.size(), cols = A.get(0).size();
        maxArea = getMaxHistArea(A.get(0));
        for(int row = 1; row < rows; row++){
            for(int col = 0; col < cols; col++)
                if(A.get(row).get(col) == 1)
                    A.get(row).set(col, 1 + A.get(row-1).get(col));
            maxArea = Math.max(maxArea, getMaxHistArea(A.get(row)));
        }
        return maxArea;
	}


    public int getMaxHistArea(ArrayList<Integer> hist){
        int maxArea = 0, area = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < hist.size()){
            if(stack.isEmpty() || hist.get(i) >= hist.get(stack.peek()))
                stack.push(i++);
            else{
                int tp = stack.pop();
                int bottom = -1;
                if(!stack.isEmpty())bottom = stack.peek();
                area = hist.get(tp)*(i-bottom-1);
                maxArea = Math.max(area, maxArea);
            }
        }

        while(!stack.isEmpty()){
            int tp = stack.pop();
            int bottom = -1;
            if(!stack.isEmpty())bottom = stack.peek();
            area = hist.get(tp)*(i-bottom-1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
