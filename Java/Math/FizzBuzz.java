public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 1; i <= A; i++){
            String here = "";
            if((i % 3 != 0) && (i % 5 != 0))here += i;
            else{
            if(i % 3 == 0)here += "Fizz";
            if(i % 5 == 0)here += "Buzz";}
            res.add(here);
        }
        return res;
    }
}
