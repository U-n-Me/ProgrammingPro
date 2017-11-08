/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    if(a == null)return null;
	    ListNode pt1 = a, pt2 = a;
	    for(int i = 0; i <= b; i++){
	        if(pt2 != null)
	            pt2 = pt2.next;
	       else return a.next;
	    }

	    while(pt2 != null){
	        pt1 = pt1.next;
	        pt2 = pt2.next;
	    }
	   pt1.next = pt1.next.next;

	   return a;
	}
}
