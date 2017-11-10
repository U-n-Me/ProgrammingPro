public class Solution {
	public ArrayList<String> prefix(ArrayList<String> a) {
	    ArrayList<String> res = new ArrayList<String>();
	    Trie trie = new Trie();
	    for(String wrd : a)
	        trie.insert(wrd);
	    for(String wrd: a)
	        res.add(trie.getPrefix(wrd));
	    return res;
	}

	class Trie{
	    int count; // counts how many pointers go from each node
	    Trie[] child;
	    public Trie(){
	        count = 0;
	        child = new Trie[26];
	    }

    	public String getPrefix(String key){
    	    // keep on crawling until the count isn't 1
    	    int len = key.length();
    	    Trie crawl = this;
    	    StringBuilder res = new StringBuilder();
    	    for(int i = 0; crawl.count > 1; i++){
    	        char c = key.charAt(i);
    	        res.append(""+c);
    	        crawl = crawl.child[c-'a'];
    	    }
    	    return res.toString();
    	}

    	public void insert(String key){
    	    int len = key.length();
    	    Trie crawl = this;
    	    for(int i = 0; i < len; i++){
    	        int c = key.charAt(i)-'a';
    	        crawl.count++;
    	        if(crawl.child[c] == null)
    	            crawl.child[c] = new Trie();
    	        crawl = crawl.child[c];
    	    }
    	}
	}

}
