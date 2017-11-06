public class HotelBookingsPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int i = 0, j = 0;
        while(i < arrive.size() && j < depart.size()){
            int arr = arrive.get(i), dep = depart.get(j);
            if(arr < dep){
                if(K > 0)K--;
                else return false;
                i++;
            }else{
                K++;
                j++;
            }
        }
        return true;
    }
}
