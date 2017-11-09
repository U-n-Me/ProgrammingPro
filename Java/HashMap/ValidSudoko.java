public class Solution {
	public int isValidSudoku(final List<String> a) {
	    ArrayList<ArrayList<String>> sudoko = new ArrayList<>();
	    HashSet<String> set = new HashSet<>();

	    //check row
	    for(String row : a){
	        ArrayList<String> list = new ArrayList<>(Arrays.asList(row.split("")));
	        sudoko.add(list);
	        set.clear();
	       // System.out.println("\nrow");
	        for(String c : row.split("")){
	          //  System.out.print(c+" ");
	            if(set.contains(c))return 0;
	            else if(!c.equals("."))set.add(c);
	        }
	    }

	    //check columns
	    for(int col = 0; col < 9; col++){
	        set.clear();
	       // System.out.println("col");
	        for(int row = 0; row < 9; row++){
	            String c = sudoko.get(row).get(col);
	         //   System.out.print(c+" ");
	            if(set.contains(c))return 0;
	            else if(!c.equals("."))set.add(c);
	        }
	    }

	    //check small sq.
	    for(int row = 0; row < 3; row++){
	        for(int col = 0; col < 3; col++){
	            set.clear();
	            //System.out.println("\nSmall");
	            for(int i  = 0; i < 3; i++){
	                for(int j = 0; j < 3; j++){
	                    String c = sudoko.get(3*row+i).get(3*col+j);
	                   // System.out.print(c+" ");
        	            if(set.contains(c))return 0;
        	            else if(!c.equals("."))set.add(c);
	                }
	            }
	        }
	    }
	    return 1;
	}
}
