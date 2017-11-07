public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> res = new ArrayList<>();

        /*int smallers = 0;
        for(int i = 0; i < A.length(); i++)
            if(A.charAt(i) == 'D')smallers++;
        int starting = smallers + 1;
        res.add(starting++);
        for(int i = 0; i < A.length(); i++){
            char c = A.charAt(i);
            if(c == 'D')res.add(smallers--);
            else res.add(starting++);
        }
        */

        int largest = B, smallest = 1;
        for(int i = 0; i < A.length(); i++){
            char c = A.charAt(i);
            if(c == 'I')
                res.add(smallest++);
            else
                res.add(largest--);
        }
        res.add(smallest);
        return res;
    }
}
