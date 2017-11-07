public class Solution {
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(a == 4){res.add(2);res.add(2);return res;}
        for(int i = 3; i < a / 2; i += 2){
            if(prime(i) && prime(a-i)){
                res.add(i); res.add(a-i);
                return res;
            }
        }
        return res;
    }

    public boolean prime(int n){
        if(n == 3)return true;
        if((n % 3) == 0) return false;
        int rng = (int)Math.sqrt(n);
        for(int i = 5; i <= rng; i += 6){
            if((n % i) == 0 || (n % (i + 2)) == 0)
                return false;
        }
        return true;
    }
}
