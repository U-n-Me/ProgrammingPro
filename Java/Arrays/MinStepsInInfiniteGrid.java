public class MinStepsInInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int x = X.get(0), y = Y.get(0), size = X.size(), steps = 0;
        for(int i = 1; i < size; i++){
            int xDiff = Math.abs(x - X.get(i));
            int yDiff = Math.abs(y - Y.get(i));
            steps += Math.max(xDiff, yDiff);
            x = X.get(i); y = Y.get(i);
        }

        return steps;
    }
}
