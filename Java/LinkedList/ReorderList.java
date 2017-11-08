/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reorderList(ListNode a) {
	    ListNode fHalf = a, lHalf = null;
	    int size = 0;
	    while(a != null){
	        a = a.next;
	        size++;
	    }
	    if(size < 3)return fHalf;
	    if(size % 2 == 0)size = size / 2;
	    else size = size / 2 + 1;

	    a = fHalf;
	    for(int i = 1; i < size; i++)
	        fHalf = fHalf.next;
	    lHalf = fHalf.next;
	    fHalf.next = null;

	    fHalf = a;
	    ListNode reverse = null, rslt = fHalf;
	    while(lHalf != null){
	        ListNode next = lHalf.next;
	        lHalf.next = reverse;
	        reverse = lHalf;
	        lHalf = next;
	    }
	    while(fHalf.next != null){
	        ListNode next = fHalf.next;
	        fHalf.next = reverse;
	        reverse = reverse.next;
	        fHalf.next.next = next;
	        fHalf = next;
	    }
	    fHalf.next = reverse;
	    return rslt;
	}
}
