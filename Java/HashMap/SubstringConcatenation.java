public class Solution {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	   ArrayList<Integer> res = new ArrayList<>();
	   HashMap<String, Integer> map = new HashMap<>();
	   for(String str : b){
	       if(!map.containsKey(str))map.put(str, 0);
	       map.put(str, map.get(str)+1);
	   }

	   // Now take substring of b's tot size
	   int chunkSize = b.get(0).length();
	   int len = b.size()*chunkSize;
	   for(int i = 0; i + len <= a.length(); i++){
	       String substr = a.substring(i, i + len);
	       boolean allFound = true;
	       //System.out.println(len+" "+substr);
	       for(int j = 0; j + chunkSize <= len; j += chunkSize){
	           //System.out.print("\t"+substr.substring(j, j + chunkSize));
	           String chunkSub = substr.substring(j, j + chunkSize);
	           if(!map.containsKey(chunkSub))allFound = false;
	           else{
	               map.put(chunkSub, map.get(chunkSub)-1);
	               int num = map.get(chunkSub);
	               if(num < 0)allFound = false;
	           }
	       }

	       // Add back removed num of occurence
	       for(int j = 0; j + chunkSize <= len; j += chunkSize){
	           String chunkSub = substr.substring(j, j + chunkSize);
	           if(map.containsKey(chunkSub)){
	               int num = map.get(chunkSub);
	               map.put(chunkSub, num+1);
	           }
	       }
	     if(allFound)res.add(i);
	   }
	   return res;
	}
}
