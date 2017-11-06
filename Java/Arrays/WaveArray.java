public class WaveArray {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);
	    for(int i = 0; i < a.size(); i += 2){
	        int ai = a.get(i);
	        if(i + 1 >= a.size())break;
	        a.set(i, a.get(i+1));
	        a.set(i+1, ai);
	    }
	    return a;
	}
}
