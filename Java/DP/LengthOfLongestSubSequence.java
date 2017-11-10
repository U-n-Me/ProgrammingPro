public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        int len = A.size();
         ArrayList<Integer> lis = new ArrayList<>();
         ArrayList<Integer> lds = new ArrayList<>();
         for(int i = 0; i < len; i++){
             lis.add(1);
             lds.add(1);
         }

         // Get LIS
         for(int i = 1; i < len; i++){
             for(int j = 0; j < i; j++)
                if(A.get(j) < A.get(i) && lis.get(i) < lis.get(j) + 1)
                    lis.set(i, lis.get(j) + 1);
         }

         // Get LDS
         for(int i = len-2; i >= 0; i--){
             for(int j = len-1; j > i; j--)
                if(A.get(j) < A.get(i) && lds.get(i) < lds.get(j) + 1)
                    lds.set(i, lds.get(j) + 1);
         }

         int max = 0;
         for(int i = 0; i < len; i++){
            max = Math.max(max, lis.get(i)+lds.get(i)-1);
        }
        // System.out.println(lis+"\n"+lds);
         return max;
    }
}
